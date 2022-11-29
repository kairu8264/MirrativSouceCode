package yg;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes3.dex */
public final class z implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Context f62002w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f62003x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f62004y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f62005z;

    public z(a0 a0Var, Context context, String str, boolean z10, boolean z11) {
        this.f62002w = context;
        this.f62003x = str;
        this.f62004y = z10;
        this.f62005z = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f62002w);
        builder.setMessage(this.f62003x);
        if (this.f62004y) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f62005z) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new y(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
