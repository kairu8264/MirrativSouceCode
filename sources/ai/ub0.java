package ai;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* loaded from: classes3.dex */
public final class ub0 implements DialogInterface.OnClickListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f10666w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f10667x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ wb0 f10668y;

    public ub0(wb0 wb0Var, String str, String str2) {
        this.f10668y = wb0Var;
        this.f10666w = str;
        this.f10667x = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Context context;
        context = this.f10668y.f11535d;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        try {
            String str = this.f10666w;
            String str2 = this.f10667x;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            wg.t.d();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f10668y.b("Could not store picture.");
        }
    }
}
