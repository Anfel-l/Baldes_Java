package interfaz; 

import mundo.Jarras;

public class InterfazApp 
{
    // 11-03-2022
    public static void main(String[] args) 
    { Jarras jarras;
       
   // TEST 1 
      System.out.println("TEST 1");
      jarras = new Jarras();
      System.out.println("subtest 0: " + jarras.getJarra6() + " " + jarras.getJarra8());
      
   // test 1
      jarras.llenar8();
      jarras.llenar6();      
      System.out.println("subtest 1: " + jarras.getJarra6() + " " + jarras.getJarra8());
      
   // test 2
      jarras.vaciar68();
      jarras.vaciar86();      
      System.out.println("subtest 2: " + jarras.getJarra6() + " " + jarras.getJarra8());

   // test 3
      jarras.descargar8();
      jarras.vaciar68();
      System.out.println("subtest 3: " + jarras.getJarra6() + " " + jarras.getJarra8());
      
   // test 4
      jarras.llenar8();
      jarras.vaciar86();
      System.out.println("subtest 4: " + jarras.getJarra6() + " " + jarras.getJarra8());
      
   // test 5
      jarras.descargar8();
      jarras.descargar6();
      jarras.llenar8();
      jarras.vaciar86();
      System.out.println("subtest 5: " + jarras.getJarra6() + " " + jarras.getJarra8());
      
      jarras.setJarra8(4);
      jarras.setJarra6(5);
      jarras.llenar86();
      System.out.println("subtest 6: " + jarras.getJarra6() + " " + jarras.getJarra8());
      
      jarras.setJarra8(4);
      jarras.setJarra6(2);
      jarras.llenar68();
      System.out.println("subtest 7: " + jarras.getJarra6() + " " + jarras.getJarra8());
      
      jarras.vaciar86();
      System.out.println("subtest 8: " + jarras.getJarra6() + " " + jarras.getJarra8());
      
      jarras.vaciar68();
      System.out.println("subtest 9: " + jarras.getJarra6() + " " + jarras.getJarra8());

      jarras.setJarra8(8);
      jarras.setJarra6(4);
      jarras.llenar68();
      System.out.println("subtest A: " + jarras.getJarra6() + " " + jarras.getJarra8());
      
      jarras.setJarra8(7);
      jarras.setJarra6(2);
      jarras.llenar86();
      System.out.println("subtest B: " + jarras.getJarra6() + " " + jarras.getJarra8());
      


   // TEST 2
      System.out.println("TEST 2");
      jarras = new Jarras(5, 3);
      System.out.println("subtest 0: " + jarras.getJarra6() + " " + jarras.getJarra8());

      jarras.llenar68();
      System.out.println("subtest 1: " + jarras.getJarra6() + " " + jarras.getJarra8());
      jarras.descargar6(); 
      System.out.println("subtest 2: " + jarras.getJarra6() + " " + jarras.getJarra8());
      jarras.vaciar86();
      System.out.println("subtest 3: " + jarras.getJarra6() + " " + jarras.getJarra8());
      jarras.llenar8();
      System.out.println("subtest 4: " + jarras.getJarra6() + " " + jarras.getJarra8());
      jarras.llenar68();
      System.out.println("subtest 5: " + jarras.getJarra6() + " " + jarras.getJarra8());
      jarras.descargar6();
      System.out.println("subtest 6: " + jarras.getJarra6() + " " + jarras.getJarra8());
    } 
}
