package com.blankj.custom.desingn_pattern.adapter;

public class Adapter {
//    public class Scanner{
//        public void read(Readable material){
//            material.read();
//        }
//    }
//
//    public interface Readable{
//        void read();
//    }
//    public class TXT implements Readable{
//        ...
//        public void read(){
//            //读取txt文件
//        }
//        ...
//    }
//
//    public class HTML{
//        public void toReadableFormat(){
//            //html文件也可以被读取，但是它并没有继承Readable接口，所以无法被Scanner
//            识别
//        }
//    }
//
//    //这里才是适配器模式
//    public class HTMLAdapter implements Readable{
//        ...
//        private HTML html;
//        public HTMLAdapter(HTML html){this.html = html}
//        public void read(){
//            html.toReadableFormat();
//        }
//        ...
//    }
//
//    //这时候两个文件都可以被读取了
//    public class Test{
//        public static void main(String[] args){
//            Scanner s = new Scanner();
//            s.read(new TXT());
//            s.read(new HTMLAdapter(new HTML()));
//        }
//    }
}
