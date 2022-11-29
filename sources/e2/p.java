package e2;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    public final wn.f f30129a;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<InputMethodManager> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Context f30130w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f30130w = context;
        }

        @Override // io.a
        /* renamed from: a */
        public final InputMethodManager invoke() {
            Object systemService = this.f30130w.getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public p(Context context) {
        jo.p.h(context, "context");
        this.f30129a = wn.g.b(wn.i.NONE, new a(context));
    }

    @Override // e2.o
    public void a(IBinder iBinder) {
        f().hideSoftInputFromWindow(iBinder, 0);
    }

    @Override // e2.o
    public void b(View view, int i10, int i11, int i12, int i13) {
        jo.p.h(view, "view");
        f().updateSelection(view, i10, i11, i12, i13);
    }

    @Override // e2.o
    public void c(View view) {
        jo.p.h(view, "view");
        f().showSoftInput(view, 0);
    }

    @Override // e2.o
    public void d(View view, int i10, ExtractedText extractedText) {
        jo.p.h(view, "view");
        jo.p.h(extractedText, "extractedText");
        f().updateExtractedText(view, i10, extractedText);
    }

    @Override // e2.o
    public void e(View view) {
        jo.p.h(view, "view");
        f().restartInput(view);
    }

    public final InputMethodManager f() {
        return (InputMethodManager) this.f30129a.getValue();
    }
}
