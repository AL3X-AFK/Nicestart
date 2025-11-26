package com.example.nicestart;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.android.material.snackbar.Snackbar;
import com.shashank.sony.fancytoastlib.FancyToast;
import com.tapadoo.alerter.Alerter;

public class MainActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        // Agrega el context menu al text view
        TextView mycontext = findViewById(R.id.mycontext);
        registerForContextMenu(mycontext);



        swipeLayout = findViewById(R.id.myswipe);
        //Registra un listener para detectar cuando el usuario arrastra hacia abajo para refrescar
        swipeLayout.setOnRefreshListener(mOnRefreshListener);

    }


    /**
     * The M on refresh listener.
     */
    protected SwipeRefreshLayout.OnRefreshListener
            mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
//            Toast toast0 = Toast.makeText(MainActivity.this, "Hi there! I don't exist :)", Toast.LENGTH_LONG);
//            toast0.show();
//
             //Detiene el efecto de recarga
            swipeLayout.setRefreshing(false);
            //Encontrar el layout principal
            ConstraintLayout mLayout = findViewById(R.id.myMainConstrain);

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
//            miVisorWeb.reload();
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
            Toast toast = FancyToast.makeText(this,"Item copied!", FancyToast.LENGTH_LONG, FancyToast.SUCCESS, true);
//            Toast toast = Toast.makeText(this, "Item copied", Toast.LENGTH_LONG);
            toast.show();

        } else if (item.getItemId() == R.id.item2) {
            //Toast sin icono de android
            Toast toast2 = FancyToast.makeText(this,"Downloading item...", FancyToast.LENGTH_LONG, FancyToast.WARNING, false);
            toast2.show();
            //Creacion de alerta
            Alerter.create(this).
                    setTitle("Downloading").
                    setText("Image.png").
                    setBackgroundColorRes(R.color.g3).
                    show();
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
}