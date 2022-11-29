package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import e.f;

/* loaded from: classes.dex */
public class a extends f {

    /* renamed from: y  reason: collision with root package name */
    public final AlertController f14179y;

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0045a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.f f14180a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14181b;

        public C0045a(Context context) {
            this(context, a.f(context, 0));
        }

        public C0045a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f14180a;
            fVar.f14163w = listAdapter;
            fVar.f14164x = onClickListener;
            return this;
        }

        public C0045a b(boolean z10) {
            this.f14180a.f14158r = z10;
            return this;
        }

        public C0045a c(View view) {
            this.f14180a.f14147g = view;
            return this;
        }

        public a create() {
            a aVar = new a(this.f14180a.f14141a, this.f14181b);
            this.f14180a.a(aVar.f14179y);
            aVar.setCancelable(this.f14180a.f14158r);
            if (this.f14180a.f14158r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f14180a.f14159s);
            aVar.setOnDismissListener(this.f14180a.f14160t);
            DialogInterface.OnKeyListener onKeyListener = this.f14180a.f14161u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public C0045a d(int i10) {
            this.f14180a.f14143c = i10;
            return this;
        }

        public C0045a e(Drawable drawable) {
            this.f14180a.f14144d = drawable;
            return this;
        }

        public C0045a f(int i10) {
            AlertController.f fVar = this.f14180a;
            fVar.f14148h = fVar.f14141a.getText(i10);
            return this;
        }

        public C0045a g(CharSequence charSequence) {
            this.f14180a.f14148h = charSequence;
            return this;
        }

        public Context getContext() {
            return this.f14180a.f14141a;
        }

        public C0045a h(DialogInterface.OnKeyListener onKeyListener) {
            this.f14180a.f14161u = onKeyListener;
            return this;
        }

        public C0045a i(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f14180a;
            fVar.f14163w = listAdapter;
            fVar.f14164x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public C0045a j(int i10) {
            AlertController.f fVar = this.f14180a;
            fVar.f14146f = fVar.f14141a.getText(i10);
            return this;
        }

        public a k() {
            a create = create();
            create.show();
            return create;
        }

        public C0045a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f14180a;
            fVar.f14152l = fVar.f14141a.getText(i10);
            this.f14180a.f14154n = onClickListener;
            return this;
        }

        public C0045a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f14180a;
            fVar.f14149i = fVar.f14141a.getText(i10);
            this.f14180a.f14151k = onClickListener;
            return this;
        }

        public C0045a setTitle(CharSequence charSequence) {
            this.f14180a.f14146f = charSequence;
            return this;
        }

        public C0045a setView(View view) {
            AlertController.f fVar = this.f14180a;
            fVar.f14166z = view;
            fVar.f14165y = 0;
            fVar.E = false;
            return this;
        }

        public C0045a(Context context, int i10) {
            this.f14180a = new AlertController.f(new ContextThemeWrapper(context, a.f(context, i10)));
            this.f14181b = i10;
        }
    }

    public a(Context context, int i10) {
        super(context, f(context, i10));
        this.f14179y = new AlertController(getContext(), this, getWindow());
    }

    public static int f(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(d.a.f28644q, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f14179y.d();
    }

    @Override // e.f, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14179y.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f14179y.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f14179y.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // e.f, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f14179y.q(charSequence);
    }
}
