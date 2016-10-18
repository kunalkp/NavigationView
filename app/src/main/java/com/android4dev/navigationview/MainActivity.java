package com.android4dev.navigationview;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.CompoundButtonCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Defining Variables
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing Toolbar and setting it as the actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initializing NavigationView
        navigationView = (NavigationView)
                findViewById(R.id.navigation_view);

        //Default Fragment
        HomeFragment homefragment = new HomeFragment();
        android.support.v4.app.FragmentTransaction homeFragmentTransaction
                = getSupportFragmentManager().beginTransaction();
        homeFragmentTransaction.replace(R.id.frame,homefragment);
        homeFragmentTransaction.commit();

        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener
                (new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                //Checking if the item is in checked state or not, if not make it in checked state
                if(menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()){

                    case R.id.home:
                        HomeFragment homefragment = new HomeFragment();
                        android.support.v4.app.FragmentTransaction homeFragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        homeFragmentTransaction.replace(R.id.frame,homefragment);
                        homeFragmentTransaction.commit();
                        return true;

                    case R.id.a1:

                        AreaOfCircleFragment a1fragment = new AreaOfCircleFragment();
                        android.support.v4.app.FragmentTransaction a1FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a1FragmentTransaction.replace(R.id.frame,a1fragment);
                        a1FragmentTransaction.commit();
                        return true;

                    case R.id.a2:
                        EvenOddFragment a2fragment = new EvenOddFragment();
                        android.support.v4.app.FragmentTransaction a2FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a2FragmentTransaction.replace(R.id.frame,a2fragment);
                        a2FragmentTransaction.commit();
                        return true;

                    case R.id.a3:
                        TemperatureConverterFragment a3fragment = new TemperatureConverterFragment();
                        android.support.v4.app.FragmentTransaction a3FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a3FragmentTransaction.replace(R.id.frame,a3fragment);
                        a3FragmentTransaction.commit();
                        return true;

                    case R.id.a4:
                        UnitConverterFragment a4fragment = new UnitConverterFragment();
                        android.support.v4.app.FragmentTransaction a4FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a4FragmentTransaction.replace(R.id.frame,a4fragment);
                        a4FragmentTransaction.commit();
                        return true;

                    case R.id.a5:
                        SimpleInterestFragment a5fragment = new SimpleInterestFragment();
                        android.support.v4.app.FragmentTransaction a5FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a5FragmentTransaction.replace(R.id.frame,a5fragment);
                        a5FragmentTransaction.commit();
                        return true;

                    case R.id.a6:
                        StringComparisonFragment a6fragment = new StringComparisonFragment();
                        android.support.v4.app.FragmentTransaction a6FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a6FragmentTransaction.replace(R.id.frame,a6fragment);
                        a6FragmentTransaction.commit();
                        return true;

                    case R.id.a7:
                        ArrayOperationFragment a7fragment = new ArrayOperationFragment();
                        android.support.v4.app.FragmentTransaction a7FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a7FragmentTransaction.replace(R.id.frame,a7fragment);
                        a7FragmentTransaction.commit();
                        return true;

                    case R.id.a8:
                        ArmstrongNumberFragment a8fragment = new ArmstrongNumberFragment();
                        android.support.v4.app.FragmentTransaction a8FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a8FragmentTransaction.replace(R.id.frame,a8fragment);
                        a8FragmentTransaction.commit();
                        return true;

                    case R.id.a9:
                        RandomNumberGeneratorFragment a9fragment = new RandomNumberGeneratorFragment();
                        android.support.v4.app.FragmentTransaction a9FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a9FragmentTransaction.replace(R.id.frame,a9fragment);
                        a9FragmentTransaction.commit();
                        return true;

                    case R.id.a10:
                        ArithmaticOperationsFragment a10fragment = new ArithmaticOperationsFragment();
                        android.support.v4.app.FragmentTransaction a10FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a10FragmentTransaction.replace(R.id.frame,a10fragment);
                        a10FragmentTransaction.commit();
                        return true;

                    case R.id.a11:
                        SwapArrayElementFragment a11fragment = new SwapArrayElementFragment();
                        android.support.v4.app.FragmentTransaction a11FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a11FragmentTransaction.replace(R.id.frame,a11fragment);
                        a11FragmentTransaction.commit();
                        return true;

                    case R.id.a12:
                        StudentReportFragment a12fragment = new StudentReportFragment();
                        android.support.v4.app.FragmentTransaction a12FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a12FragmentTransaction.replace(R.id.frame,a12fragment);
                        a12FragmentTransaction.commit();
                        return true;

                    case R.id.a13:
                        GrossSalaryFragment a13fragment = new GrossSalaryFragment();
                        android.support.v4.app.FragmentTransaction a13FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a13FragmentTransaction.replace(R.id.frame,a13fragment);
                        a13FragmentTransaction.commit();
                        return true;

                    case R.id.a14:
                        CompoundInterestFragment a14fragment = new CompoundInterestFragment();
                        android.support.v4.app.FragmentTransaction a14FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a14FragmentTransaction.replace(R.id.frame,a14fragment);
                        a14FragmentTransaction.commit();
                        return true;

                    case R.id.a15:
                        DriverEligibiltyFragment a15fragment = new DriverEligibiltyFragment();
                        android.support.v4.app.FragmentTransaction a15FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a15FragmentTransaction.replace(R.id.frame,a15fragment);
                        a15FragmentTransaction.commit();
                        return true;

                    case R.id.a16:
                        CharacterCheckFragment a16fragment = new CharacterCheckFragment();
                        android.support.v4.app.FragmentTransaction a16FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a16FragmentTransaction.replace(R.id.frame,a16fragment);
                        a16FragmentTransaction.commit();
                        return true;

                    case R.id.a17:
                        InsurancePremiumFragment a17fragment = new InsurancePremiumFragment();
                        android.support.v4.app.FragmentTransaction a17FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a17FragmentTransaction.replace(R.id.frame,a17fragment);
                        a17FragmentTransaction.commit();
                        return true;

                    case R.id.a18:
                        SteelGradeFragment a18fragment = new SteelGradeFragment();
                        android.support.v4.app.FragmentTransaction a18FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a18FragmentTransaction.replace(R.id.frame,a18fragment);
                        a18FragmentTransaction.commit();
                        return true;

                    case R.id.a19:
                        NotesBreakdownFragment a19fragment = new NotesBreakdownFragment();
                        android.support.v4.app.FragmentTransaction a19FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a19FragmentTransaction.replace(R.id.frame,a19fragment);
                        a19FragmentTransaction.commit();
                        return true;

                    case R.id.a20:
                        TelephoneBillFragment a20fragment = new TelephoneBillFragment();
                        android.support.v4.app.FragmentTransaction a20FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a20FragmentTransaction.replace(R.id.frame,a20fragment);
                        a20FragmentTransaction.commit();
                        return true;

                    case R.id.a21:
                        MatrixFragment a21fragment = new MatrixFragment();
                        android.support.v4.app.FragmentTransaction a21FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a21FragmentTransaction.replace(R.id.frame,a21fragment);
                        a21FragmentTransaction.commit();
                        return true;

                    case R.id.a22:
                        RecordsFragment a22fragment = new RecordsFragment();
                        android.support.v4.app.FragmentTransaction a22FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a22FragmentTransaction.replace(R.id.frame,a22fragment);
                        a22FragmentTransaction.commit();
                        return true;

                    case R.id.a23:
                        CalculatorFragment a23fragment = new CalculatorFragment();
                        android.support.v4.app.FragmentTransaction a23FragmentTransaction
                                = getSupportFragmentManager().beginTransaction();
                        a23FragmentTransaction.replace(R.id.frame,a23fragment);
                        a23FragmentTransaction.commit();
                        return true;

                    default:
                        Toast.makeText(getApplicationContext(),"Somethings Wrong",Toast.LENGTH_SHORT).show();
                        return true;

                }
            }
        });

        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle
                = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.openDrawer, R.string.closeDrawer){

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank
                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
