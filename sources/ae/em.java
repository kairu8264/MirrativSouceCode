package ae;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class em extends ViewDataBinding {
    public final AppCompatButton B;
    public final RadioGroup C;
    public final EditText D;
    public final AppCompatButton E;

    public em(Object obj, View view, int i10, AppCompatButton appCompatButton, RadioGroup radioGroup, EditText editText, AppCompatButton appCompatButton2) {
        super(obj, view, i10);
        this.B = appCompatButton;
        this.C = radioGroup;
        this.D = editText;
        this.E = appCompatButton2;
    }
}
