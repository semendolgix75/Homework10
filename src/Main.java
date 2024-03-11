public class Main {
    public static void main(String[] args) {
//        Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном формате.
        System.out.println("\nTask1\n Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.");
        String firstName="Ivan";                    //        С именем  firstName — для хранения имени.
        String middleName="Ivanovich";               //        С именем  middleName — для хранения отчества.
        String lastName="Ivanov";                   //        С именем lastName — для хранения фамилии.
        String fullName=lastName+" "+firstName+" "+middleName; //        С именем fullName для хранения Ф. И. О. сотрудника в формате «Фамилия Имя Отчество».
        System.out.println("Ф. И. О. сотрудника — "+ fullName);

//Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников,
// полностью написанные заглавными буквами (верхним регистром).
        System.out.println(" \nTask2\n Напишите программу, которая изменит написание Ф. И. О. сотрудника с Ivanov Ivan Ivanovich на полностью заглавные буквы.");
        String fullUpName = fullName.toUpperCase();
        System.out.println("Ф. И. О. сотрудника — "+ fullUpName);

//Система, в которой мы работаем, не принимает символ «ё».
        System.out.println("\nTask3\n Напишите программу, которая заменяет символ «ё» на символ «е».");
        fullName="Иванов Семён Семёнович"; //В качестве исходных данных используйте строку и данные в ней — «Иванов Семён Семёнович».
        String fullNameReplace = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — "+fullNameReplace);


    }
}