package com.example.sampleannotation;


import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;


@EActivity(R.layout.activity_annotation)
public class AnnotationActivity extends Activity{

	@ViewById(R.id.myInput)
	EditText edtText;
	
	@ViewById(R.id.myButtonClick)
	Button btnMy;
	
	@ViewById(R.id.myTextView)
	TextView tvChange;

	
	@AfterViews
	void ChangeEditText(){
		edtText.setText("Hello world");
		btnMy.setText("Don't Click");
		tvChange.setText("Change the world");
		
	}


	
	
}
