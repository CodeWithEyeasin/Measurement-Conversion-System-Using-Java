import java.util.Scanner;
public class MeasurementConversion extends Login {
    Scanner input=new Scanner(System.in);
    int Number;
    double Length, Result;
   void Conversion() {
        while (true)
        {
            System.out.println("Choose A Measurement You Want To Convert \n 1.Meter \n 2.Kilometer \n 3.Centimeter \n 4.Millimeter \n 5.Exit");
             Number=input.nextInt();
            switch (Number)
            {
                case 1:MeterToOther();
                    break;
                case 2:KilometerToOther();
                    break;
                case 3:CentimeterToOther();
                    break;
                case 4:MillimeterToOther();
                    break;
                case 5: System.exit(0);
                    break;
                default:
                    System.out.println("Warning Wrong Input Please Enter The Right Input Thank You");
            }

        }

    }
    void MeterToOther()
    {
        System.out.println("Enter The Meter Value :");
        Length=input.nextInt();
        while (true)
        {
            System.out.println("Choose Which Measurement You Want To Convert From The Meter\n 1.Kilometer\n 2.Centimeter\n 3.Millimeter\n 4.Choose Again\n 5.Exit");
            Number=input.nextInt();
            switch (Number)
            {
                case 1 -> {
                    Result = Length / 1000;
                    System.out.println(Length + " Meter Means " + Result + " Kilometer");
                    Conversion();
                }
                case 2 -> {
                    Result = Length * 100;
                    System.out.println(Length + " Meter Means " + Result + " Centimeter");
                    Conversion();
                }
                case 3 -> {
                    Result = Length * 1000;
                    System.out.println(Length + " Meter Means " + Result + " Millimeter");
                    Conversion();
                }
                case 4 -> Conversion();
                case 5 -> System.exit(0);
                default -> System.out.println("Warning Wrong Input Please Enter The Right Input Thank You");
            }

        }

    }

    void KilometerToOther()
    {
        System.out.println("Enter The Kilometer Value :");
        Length=input.nextInt();
        while (true)
        {
            System.out.println("Choose Which Measurement You Want To Convert From The Kilometer\n 1.Meter\n 2.Centimeter\n 3.Millimeter\n 4.Choose Again\n 5.Exit");
            Number=input.nextInt();
            switch (Number)
            {
                case 1 -> {
                    Result = Length * 1000;
                    System.out.println(Length + " Kilometer Means " + Result + " Meter");
                    Conversion();
                }
                case 2 -> {
                    Result = Length * 100000;
                    System.out.println(Length + " Kilometer Means " + Result + " Centimeter");
                    Conversion();
                }
                case 3 -> {
                    Result = Length * 1000000;
                    System.out.println(Length + " Kilometer Means " + Result + " Millimeter");
                    Conversion();
                }
                case 4 -> Conversion();
                case 5 -> System.exit(0);
                default -> System.out.println("Warning Wrong Input Please Enter The Right Input Thank You");
            }

        }

    }

    void CentimeterToOther()
    {
        System.out.println("Enter The Centimeter Value :");
        Length=input.nextInt();
        while (true)
        {
            System.out.println("Choose Which Measurement You Want To Convert From The Centimeter\n 1.Meter\n 2.Kilometer\n 3.Millimeter\n 4.Choose Again\n 5.Exit");
            Number=input.nextInt();
            switch (Number)
            {
                case 1 -> {
                    Result = Length / 100;
                    System.out.println(Length + " Centimeter Means " + Result + " Meter");
                    Conversion();
                }
                case 2 -> {
                    Result = Length / 100000;
                    System.out.println(Length + " Centimeter Means " + Result + " Kilometer");
                    Conversion();
                }
                case 3 -> {
                    Result = Length * 10;
                    System.out.println(Length + " Centimeter Means " + Result + " Millimeter");
                    Conversion();
                }
                case 4 -> Conversion();
                case 5 -> System.exit(0);
                default -> System.out.println("Warning Wrong Input Please Enter The Right Input Thank You");
            }

        }

    }

    void MillimeterToOther()
    {
        System.out.println("Enter The Millimeter Value :");
        Length=input.nextInt();
        while (true)
        {
            System.out.println("Choose Which Measurement You Want To Convert From The Millimeter\n 1.Meter\n 2.Kilometer\n 3.Centimeter\n 4.Choose Again\n 5.Exit");
            Number=input.nextInt();
            switch (Number)
            {
                case 1 -> {
                    Result = Length / 1000;
                    System.out.println(Length + " Millimeter Means " + Result + " Meter");
                    Conversion();
                }
                case 2 -> {
                    Result = Length / 1000000;
                    System.out.println(Length + " Millimeter Means " + Result + " Kilometer");
                    Conversion();
                }
                case 3 -> {
                    Result = Length / 10;
                    System.out.println(Length + " Millimeter Means " + Result + " Centimeter");
                    Conversion();
                }
                case 4 -> Conversion();
                case 5 -> System.exit(0);
                default -> System.out.println("Warning Wrong Input Please Enter The Right Input Thank You");
            }

        }

    }



}
