package methodoverriding24;

 class Test {
        public static void main(String args[]){
            SBI s=new SBI();
            ICIC i=new ICIC();
            AXIS a=new AXIS();
            System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
            System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
            System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
        }
    }

