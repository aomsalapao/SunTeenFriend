package th.co.sunteen.sunteenfriend.utility;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import th.co.sunteen.sunteenfriend.R;

public class MyAlertDialog {
private Context context;
public MyAlertDialog(Context context){
    this.context=context;
}

    public void normalDialog(String titleString, String datailString) {

        AlertDialog.Builder builder=new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.ic_action_alert);
        builder.setTitle(titleString);
        builder.setMessage(datailString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();

            }
        });
        builder.show();

    }



}//Main Class

