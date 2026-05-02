package Enum;

enum Enums1
{
    ONE
            {
                String s = "ONE";

                void methodOfONE()
                {
                    System.out.println(s);
                }
            },

    TWO
            {
                String s = "TWO";

                void methodOfTWO()
                {
                    System.out.println(s);
                }
            };

    void commonMethod()
    {
        System.out.println("Common method");
    }
}

public class EnumConstBody
{
    public static void main(String[] args)
    {
        Enums1.ONE.commonMethod();

        Enums1.TWO.commonMethod();

        //Enums.ONE.methodOfONE();     //Complie time error, methodOfONE() not visible outisde the ONE's body

        //Enums.TWO.methodOfTWO();     //Complie time error, methodOfTWO() not visible outisde the TWO's body
    }
}