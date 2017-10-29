package gwc.com.registerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText Password;//定义Password输入框的名字
    EditText Confirm;//定义确认密码输入框的名字
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Password = (EditText) findViewById(R.id.password); //通过findViewById找到输入框控件对应的id并给它起一个名字
        Confirm = (EditText) findViewById(R.id.confirm);//通过findViewById找到输入框控件对应的id并给它起一个名字
        Button Register=(Button) findViewById(R.id.Register);//通过findViewById找到按钮控件对应的id并给它起一个名字
        Register.setOnClickListener(new View.OnClickListener() //监听有没有点击按钮控件 如果点击了就会执行onClick函数
        {
            @Override
            public void onClick(View view)
            {
                check(Password.getText().toString().trim(),Confirm.getText().toString().trim()); //调用check函数
            }
        });
    }
    public void check(String password,String confirm)//检查两次输入的密码是否一致
    {
        if(password.equals(confirm))
        {
            Toast.makeText(MainActivity.this,"Success!Welcome!", Toast.LENGTH_SHORT).show();//弹框
        }
        else
            Toast.makeText(MainActivity.this,"Please type the same password!", Toast.LENGTH_SHORT).show();//弹框
    }
}
