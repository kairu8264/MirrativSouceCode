package xj;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public TextInputLayout f60320a;

    /* renamed from: b  reason: collision with root package name */
    public Context f60321b;

    /* renamed from: c  reason: collision with root package name */
    public CheckableImageButton f60322c;

    public c(TextInputLayout textInputLayout) {
        this.f60320a = textInputLayout;
        this.f60321b = textInputLayout.getContext();
        this.f60322c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i10) {
        return true;
    }

    public void c(boolean z10) {
    }

    public boolean d() {
        return false;
    }
}
