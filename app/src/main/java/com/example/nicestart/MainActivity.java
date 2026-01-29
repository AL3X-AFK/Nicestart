package com.example.nicestart;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.shashank.sony.fancytoastlib.FancyToast;
import com.tapadoo.alerter.Alerter;

public class MainActivity extends AppCompatActivity {

    private WebView miVisorWeb;

    SwipeRefreshLayout swipeLayout;


    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Agrega el context menu al text view
//        TextView mycontext = findViewById(R.id.mycontext);
//        registerForContextMenu(mycontext);
        WebView mycontext = findViewById(R.id.vistaweb);
        registerForContextMenu(mycontext);


        swipeLayout = findViewById(R.id.myswipe);
        //Registra un listener para detectar cuando el usuario arrastra hacia abajo para refrescar
        swipeLayout.setOnRefreshListener(mOnRefreshListener);


        //Webview cargando HTML para que la imagen ocupe el activity
        miVisorWeb = findViewById(R.id.vistaweb);

        String html = "<html>"+
                "<head><style>" +
                "html, body { margin:0; padding:0; height:100%; overflow:hidden; }" +
                "img { width:100%; height:100%; object-fit:cover; }" +   // el equivalente a centerCrop
                "</style></head>" +
                "<body>" +
                "<img src='https://picsum.photos/1080/1920' />" +
                "</body></html>";
        miVisorWeb.loadDataWithBaseURL(null, html, "text/html", "UTF-8", null);
    }


    protected SwipeRefreshLayout.OnRefreshListener
            mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
//            Toast toast0 = Toast.makeText(MainActivity.this, "Hi there! I don't exist :)", Toast.LENGTH_LONG);
//            toast0.show();

            //Encontrar el layout principal
            ConstraintLayout mLayout = findViewById(R.id.myMainConstraint);

            Snackbar snackbar = Snackbar
                    .make(mLayout, "Fancy a Snack while you refresh?", Snackbar.LENGTH_SHORT)
                    .setAction("UNDO", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Snackbar snackbar1 = Snackbar.make(mLayout, "Action is restored!", Snackbar.LENGTH_SHORT);
                            snackbar1.show();
                        }
                    });

            snackbar.show();
//
          miVisorWeb.reload();
          swipeLayout.setRefreshing(false);
        }
    };


    //Creacion del context menu
    //Implementing Context Menu
    // Esto carga menu_context.xml y lo usa como menú emergente para ese TextView.
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo){
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
//        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)
//                item.getMenuInfo();
        if (item.getItemId() == R.id.item1) {
            //Creacion de toast con Fancy
            //DEFAULT/SUCCESS/INFO/WARNING/ERROR/CONFUSING
            Toast toast = FancyToast.makeText(this,"Item copied!", FancyToast.LENGTH_LONG, FancyToast.SUCCESS, false);
//            Toast toast = Toast.makeText(this, "Item copied", Toast.LENGTH_LONG);
            toast.show();

        } else if (item.getItemId() == R.id.item2) {
            //Toast sin icono de android
            Toast toast2 = FancyToast.makeText(this,"Downloading item...", FancyToast.LENGTH_LONG, FancyToast.INFO, false);
            toast2.show();

        }
        return false;
    }


    //Implementing Menu AppBar
    // Esto carga un menú en la barra superior
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.item2){
            Intent intent = new Intent(MainActivity.this, MainBab.class);
            startActivity(intent);
        }
        if(id == R.id.item3){
//            Creacion de alerta
            Alerter.create(this).
                    setTitle("Downloading").
                    setText("Image.png").
                    setBackgroundColorRes(R.color.g3).
                    show();
        }
        if(id == R.id.item4){
            Intent intent = new Intent(MainActivity.this, githubprofile.class);
            startActivity(intent);
        }
        if(id == R.id.item5){
            showAlertDialogButtonClicked(MainActivity.this);
        }
        return super.onOptionsItemSelected(item);
    }


    // DIALOGO MODAL
    @SuppressLint("ResourceAsColor")
    public void showAlertDialogButtonClicked(MainActivity mainActivity) {
        // setup the alert builder
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);


        // un XML a medida para el diálogo
        builder.setView(getLayoutInflater().inflate(R.layout.alertdialog, null));



        // add the buttons
        builder.setPositiveButton("Profile", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
//                dialog.dismiss();
            }
        });
//
        builder.setNegativeButton("Do nothing", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
            }
        });

        builder.setNeutralButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
//                dialog.dismiss();
            }
        });

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();

        //Color al texto de los botones
        Button positive = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        Button negative = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
        Button neutral = dialog.getButton(AlertDialog.BUTTON_NEUTRAL);

        positive.setTextColor(ContextCompat.getColor(this, R.color.gray));
        negative.setTextColor(ContextCompat.getColor(this, R.color.gray));
        neutral.setTextColor(ContextCompat.getColor(this, R.color.red));
    }

}