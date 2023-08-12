///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com;
//
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.print.*;
//
///**
// *
// * @author Ravi_jaiswal
// */
//public class PrintForm {
//    PrinterJob job = PrinterJob.getPrinterJob();
//            job.setJobName("Print Data");
//            
//            job.setPrintable(new Printable(){
//            public int print(Graphics pg,PageFormat pf, int pageNum){
//                    pf.setOrientation(PageFormat.LANDSCAPE);
//                 if(pageNum > 0){
//                    return Printable.NO_SUCH_PAGE;
//                }
//                
//                Graphics2D g2 = (Graphics2D)pg;
//                g2.translate(pf.getImageableX(), pf.getImageableY());
//                g2.scale(0.47,0.47);
//                
//                panel_print.print(g2);
//         
//               
//                return Printable.PAGE_EXISTS;
//                         
//                
//            }
//    });
//            boolean ok = job.printDialog();
//        if(ok){
//        try{
//            
//        job.print();
//        }
//        catch (PrinterException ex){
//	ex.printStackTrace();
//}
//        }
//
//    public static void main(String[] args) {
//        System.out.println("Hello chacha.......");
//    }
//}
