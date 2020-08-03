package com.itcodai.course17.lucence;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Paths;

public class Indexer {
    /**
     * 写索引实例
     * */
    private IndexWriter writer;
    /**
     * 构造方法，实例化IndexWriter
    * */
    public Indexer(String indexDir)throws Exception{
       Directory dir= FSDirectory.open(Paths.get(indexDir));
       //标准分词器，会自动去掉空格、is a the等单词
        Analyzer analyzer=new StandardAnalyzer();
        //将标准分词器配到写索引的配置中
       IndexWriterConfig config= new IndexWriterConfig(analyzer);
       //实例化写索引对象
        writer=new IndexWriter(dir,config);
    }
    /**
    * 索引指定目录下的所有文件
    * */
    public int indexAll(String dataDir) throws Exception{
        //获取该路径下所有的文件
        File[] files=new File(dataDir).listFiles();
        if(null != files){
            for(File file:files){
                //调用indexFile方法，对每个文件进行索引
                indexFile(file);
            }
        }
        //返回索引的文件数
        return  writer.numDocs();
    }
    /**
     * 索引指定的文件
    * */
    private void indexFile(File file)throws  Exception{
        System.out.println("索引文件的路径："+file.getCanonicalPath());
        //调用下面的getDocument方法，获取该文件的document
        Document doc= getDocument(file);
        //将doc添加到索引中
        writer.addDocument(doc);
    }
    /**
     * 获取文档，文件里在设置每一个字段。就类似于数据库中的一行记录
     * */
    private Document getDocument(File file)throws Exception{
        Document doc=new Document();
        //开始添加字段
        //添加内容
        doc.add(new TextField("contents",new FileReader(file)));
        //添加文件名，并把这个字段存到索引文件里
        doc.add(new TextField("fileName",file.getName(), Field.Store.YES));
        //添加文件路径,
        doc.add(new TextField("fullPath",file.getCanonicalPath(),Field.Store.YES));
        return doc;
    }
    /**
     * 关闭写索引
     * @throws Exception
     */
    public void close() throws Exception {
        writer.close();
    }
   public static void main(String[] args) {
        //索引保存的路径
       String indexDir="D:\\java\\Springboot\\SpringBoot\\course17\\lucene";
       //需要索引的文件数据存放的目录
       String dataDir="D:\\java\\Springboot\\SpringBoot\\course17\\lucene\\data";
       Indexer indexer=null;
       int indexedNum=0;
       //记录索引开始时间
       long startTime=System.currentTimeMillis();

       try {
           indexer=new Indexer(indexDir);
           indexedNum=indexer.indexAll(dataDir);
       } catch (Exception e) {
           e.printStackTrace();
       }finally {
           if (null !=indexer){
               try {
                   indexer.close();
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }
       }
       //记录索引结束时间
       long endTime=System.currentTimeMillis();
       System.out.println("索引耗时"+(endTime-startTime)+"毫秒");
       System.out.println("共索引了"+indexedNum+"个文件");
   }
}
