package edu.yisus.RetoFinal.UI.Languages;

public class Japanese implements Languages {

    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "\t三目並べゲームへようこそ!";
            case "select_option":
                return "次のオプションのいずれかを選択します";
            case "menu":
                return "\tメニュー\n一.プレイヤー VS コンピューター\n二.プレイヤー VS プレイヤー\n三.スコアボードを表示\n四.出口";
            case "exit":
                return "ゲームを終了します。さようなら！";
            case "error_choice":
                return "無効な選択です。ゲームを終了します。";
            case "invalid_move":
                return "無効な移動です。もう一度やり直してください。";
            case "player":
                return "プレーヤー";
            case "win":
                return "勝ちます！";
            case "tie":
                return "試合は引き分けです！";
            case "human_move":
                return "動きを入力してください (一 に 九): ";
            case "name":
                return "あなたの名前を入力してください";
            case "error_score":
                return "スコアの保存中にエラーが発生しました。";
            case "replay":
                return "また遊びたいですか? (s/n): ";
            case "you_have":
                return " あなたが持っている ";
            case "points":
                return " ポイント ";
            default:
                return "メッセージが見つかりません";
        }
    }
}