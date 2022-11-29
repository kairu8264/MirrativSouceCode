package c4;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f18812a;

    public a(View view, AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, a4.a.f444b, i10, i11);
            this.f18812a = obtainStyledAttributes.getInteger(a4.a.f445c, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }

    public int a() {
        return this.f18812a;
    }
}
