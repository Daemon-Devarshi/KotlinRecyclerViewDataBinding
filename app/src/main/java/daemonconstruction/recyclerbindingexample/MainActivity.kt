package daemonconstruction.recyclerbindingexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val personsAdapter = PersonsAdapter(PersonsProvider.getPersons())
        recyclerViewPersons.adapter = personsAdapter
        recyclerViewPersons.layoutManager = LinearLayoutManager(this)
    }
}
