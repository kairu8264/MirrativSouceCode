package ai;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wb0 extends zb0 {

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f11534c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f11535d;

    public wb0(rp0 rp0Var, Map<String, String> map) {
        super(rp0Var, "storePicture");
        this.f11534c = map;
        this.f11535d = rp0Var.g();
    }

    public final void i() {
        if (this.f11535d == null) {
            b("Activity context is not available");
            return;
        }
        wg.t.d();
        if (!new xw(this.f11535d).a()) {
            b("Feature is not supported by the device.");
            return;
        }
        String str = this.f11534c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            b("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            b(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            wg.t.d();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources j10 = wg.t.h().j();
                wg.t.d();
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f11535d);
                builder.setTitle(j10 != null ? j10.getString(vg.a.f57321h) : "Save image");
                builder.setMessage(j10 != null ? j10.getString(vg.a.f57322i) : "Allow Ad to store image in Picture gallery?");
                builder.setPositiveButton(j10 != null ? j10.getString(vg.a.f57323j) : "Accept", new ub0(this, str, lastPathSegment));
                builder.setNegativeButton(j10 != null ? j10.getString(vg.a.f57324k) : "Decline", new vb0(this));
                builder.create().show();
                return;
            }
            String valueOf2 = String.valueOf(lastPathSegment);
            b(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
        }
    }
}
