package yg;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
/* loaded from: classes3.dex */
public class h2 extends g2 {
    @Override // yg.g2, yg.e
    public final boolean g(View view) {
        return view.isAttachedToWindow();
    }

    @Override // yg.e
    public final ViewGroup.LayoutParams j() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
