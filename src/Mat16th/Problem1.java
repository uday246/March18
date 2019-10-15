package Mat16th;

public class Problem1 {

    public static void main(String[] args) {
                short a = 1200;
               
                short b = -200;

                char c = 'x';

                char d = 'y';

                float e = (float) 6.25;
                
                String aB = Integer.toBinaryString(a);
                String hex =  Integer.toHexString(Integer.parseInt(aB,2));
                System.out.println("A Binary in number : "+aB);
                System.out.println(" A Hex number: "+hex);
                
                String bB = Integer.toBinaryString(b);
                String bHex =  Integer.toHexString(Integer.parseInt(bB,2));
                System.out.println("B Binary in number : "+bB);
                System.out.println(" B Hex number: "+bHex);
                
                String cB = Integer.toBinaryString((int)b);
                String cHex =  Integer.toHexString(Integer.parseInt(cB,2));
                System.out.println("C Binary in number : "+cB);
                System.out.println(" C Hex number: "+cHex);
                
                String dB = Integer.toBinaryString((int)b);
                String dHex =  Integer.toHexString(Integer.parseInt(dB,2));
                System.out.println("D Binary in number : "+dB);
                System.out.println(" D Hex number: "+dHex);

                long eB = Double.longBitsToDouble((long)e);
                String cHex =  Integer.toHexString(Integer.parseInt(cB,2));
                System.out.println("C Binary in number : "+cB);
                System.out.println(" C Hex number: "+cHex);
    }

}