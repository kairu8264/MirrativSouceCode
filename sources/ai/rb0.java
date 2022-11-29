package ai;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.Map;

/* loaded from: classes3.dex */
public final class rb0 extends zb0 {

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f9385c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f9386d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9387e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9388f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9389g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9390h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9391i;

    public rb0(rp0 rp0Var, Map<String, String> map) {
        super(rp0Var, "createCalendarEvent");
        this.f9385c = map;
        this.f9386d = rp0Var.g();
        this.f9387e = k(MRLog.PAYLOAD_KEY_DESCRIPTION);
        this.f9390h = k("summary");
        this.f9388f = l("start_ticks");
        this.f9389g = l("end_ticks");
        this.f9391i = k("location");
    }

    public final void i() {
        if (this.f9386d == null) {
            b("Activity context is not available.");
            return;
        }
        wg.t.d();
        if (!new xw(this.f9386d).b()) {
            b("This feature is not available on the device.");
            return;
        }
        wg.t.d();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f9386d);
        Resources j10 = wg.t.h().j();
        builder.setTitle(j10 != null ? j10.getString(vg.a.f57325l) : "Create calendar event");
        builder.setMessage(j10 != null ? j10.getString(vg.a.f57326m) : "Allow Ad to create a calendar event?");
        builder.setPositiveButton(j10 != null ? j10.getString(vg.a.f57323j) : "Accept", new pb0(this));
        builder.setNegativeButton(j10 != null ? j10.getString(vg.a.f57324k) : "Decline", new qb0(this));
        builder.create().show();
    }

    @TargetApi(14)
    public final Intent j() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f9387e);
        data.putExtra("eventLocation", this.f9391i);
        data.putExtra(MRLog.PAYLOAD_KEY_DESCRIPTION, this.f9390h);
        long j10 = this.f9388f;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.f9389g;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }

    public final String k(String str) {
        return TextUtils.isEmpty(this.f9385c.get(str)) ? "" : this.f9385c.get(str);
    }

    public final long l(String str) {
        String str2 = this.f9385c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }
}
