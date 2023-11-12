package edu.yisus.reto10.Idiomas;

public class Japones implements Language{
    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "\t電卓へようこそ!";
            case "choice_option":
                return "次のオプションのいずれかを選択します。";
            case "menu":
                return "メニュー\n一. 追加\n二. 引き算するには\n三. 乗算\n四. 分割\n五. べき乗(n乗)\n六. 平方根\n七. 対数\n八. モジュール\n九. 出口";
            case "invalid_option":
                return "無効なオプションです。もう一度試してください: ";
            case "enter_first_operand":
                return "最初のオペランドを入力してください: ";
            case "enter_second_operand":
                return "2 番目のオペランドを入力します: ";
            case "enter_first_multiple":
                return "最初の倍数を入力してください: ";
            case "enter_second_multiple":
                return "2 番目の倍数を入力してください: ";
            case "enter_dividend":
                return "配当金を入力してください: ";
            case "enter_divisor":
                return "除数を入力してください: ";
            case "enter_base":
                return "基地に入る: ";
            case "enter_exponent":
                return "指数を入力してください: ";
            case "enter_index":
                return "ルートインデックスを入力してください: ";
            case "enter_filing":
                return "ルートラジンドを入力してください: ";
            case "enter_logarithmBase":
                return "対数の底を入力します: ";
            case "enter_argument":
                return "引数を入力してください: ";
            case "enter_moduloDividend":
                return "モジュールの配当を入力します: ";
            case "enter_moduloDivisor":
                return "モジュールの除数を入力します: ";
            case "exit_menu":
                return "電卓をご利用いただきありがとうございます\n良い１日を！";
            case "continue":
                return "別の操作を実行しますか? (y/n)";
            case "description_operation":
                return "手術: ";
            case "is":
                return " は ";
            case "Adding":
                return "追加 ";
            case "Subtracting":
                return "引き算するには ";
            case "multiplication":
                return "乗算 ";
            case "Dividing":
                return "分割 ";
            case "Calculating the modulus of ":
                return "モジュール ";
            case "Calculating the logarithm of":
                return "対数 ";
            case "Raising":
                return "べき乗(n乗) ";
            case "Calculating the square root of":
                return "平方根 ";
            case "result":
                return "操作は: ";
            case "ask_txt":
                return "これまでに実行された算術演算を確認しますか? (s/n): ";
            case "show_operations":
                return "実行された操作の表示...";
            default:
                return "メッセージが見つかりません";
        }
    }
}
