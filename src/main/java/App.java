public class App {
    public static void main (String [] args){
//        Câu 1
//        Cho chuỗi sau: You Only Live Once. But if You do it right. once is Enough
////        Đếm số từ viết in hoa trong chuỗi (VD: chuỗi trên có 7 ký tự in hoa)
//        Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó (VD: You Only Live Once. But If You Do It Right. Once Is Enough)
//        Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa, các chữ con lại viết thường (VD: You only live once. But if you do it right. Once is enough)
        String s = "You Only Live Once. But if You do it right. once is Enough";

        int n = EntryPoint.countUpperCaseInString(s);
        System.out.println("Total nummber of uppcase in strings is: " +n);
        String str = EntryPoint.upperCaseAllFirstLetter(s);
        System.out.println(str);
        String str1 = EntryPoint.upperCaseFirstLetterAndAfterMaker(s);
        System.out.println(str1);
    }
}
