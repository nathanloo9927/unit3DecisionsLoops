import java.util.Scanner;
public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a wavelength: ");
        double wavelength = scan.nextDouble();
        
        if (wavelength > 1e-1) {
            System.out.println("Type: Radio Waves");
            System.out.println("Frequency: < 3 x 10^9");
        } else if (wavelength >= 1e-3 && wavelength <= 1e-1) {
            System.out.println("Type: Microwaves");
            System.out.println("Frequency: 3 x 10^9 to 3 x 10^11");
        } else if (wavelength >= 7e-7 && wavelength < 1e-3) {
            System.out.println("Type: Infrared");
            System.out.println("Frequency: 3 x 10^11 to 4 x 10^14");
        } else if (wavelength >= 4e-7 && wavelength < 7e-7) {
            System.out.println("Type: Visible light");
            System.out.println("Frequency: 4 x 10^14 to 7.5 x 10^14");
        } else if (wavelength >= 1e-8 && wavelength < 4e-7) {
            System.out.println("Type: Ultraviolet");
            System.out.println("Frequency: 7.5 x 10^14 to 3 x 10^16");
        } else if (wavelength >= 1e-11 && wavelength < 1e-8) {
            System.out.println("Type: X-rays");
            System.out.println("Frequency: 3 x 10^16 to 3 x 10^19");
        } else if (wavelength < 1e-11) {
            System.out.println("Type: Gamma rays");
            System.out.println("Frequency: > 3 x 10^19");
        }
    }
}