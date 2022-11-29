package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.MyPageEmomoTutorialView;

/* loaded from: classes2.dex */
public abstract class b1 extends ViewDataBinding {
    public final MyPageEmomoTutorialView B;

    public b1(Object obj, View view, int i10, MyPageEmomoTutorialView myPageEmomoTutorialView) {
        super(obj, view, i10);
        this.B = myPageEmomoTutorialView;
    }

    public static b1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static b1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (b1) ViewDataBinding.x(layoutInflater, nd.b1.dialog_emomo_tutorial, viewGroup, z10, obj);
    }
}
