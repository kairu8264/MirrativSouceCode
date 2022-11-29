package ai;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class wx1 {

    /* renamed from: a  reason: collision with root package name */
    public final qn f11789a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f11790b;

    /* renamed from: c  reason: collision with root package name */
    public final dx1 f11791c;

    /* renamed from: d  reason: collision with root package name */
    public final zj0 f11792d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11793e;

    /* renamed from: f  reason: collision with root package name */
    public final nq2 f11794f;

    /* renamed from: g  reason: collision with root package name */
    public final yg.r1 f11795g = wg.t.h().p();

    public wx1(Context context, zj0 zj0Var, qn qnVar, dx1 dx1Var, String str, nq2 nq2Var) {
        this.f11790b = context;
        this.f11792d = zj0Var;
        this.f11789a = qnVar;
        this.f11791c = dx1Var;
        this.f11793e = str;
        this.f11794f = nq2Var;
    }

    public static final void c(SQLiteDatabase sQLiteDatabase, ArrayList<aq> arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            aq aqVar = arrayList.get(i10);
            if (aqVar.X() == 2 && aqVar.D() > j10) {
                j10 = aqVar.D();
            }
        }
        if (j10 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j10));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final void a(final boolean z10) {
        try {
            this.f11791c.a(new fp2(this, z10) { // from class: ai.sx1

                /* renamed from: a  reason: collision with root package name */
                public final wx1 f10016a;

                /* renamed from: b  reason: collision with root package name */
                public final boolean f10017b;

                {
                    this.f10016a = this;
                    this.f10017b = z10;
                }

                @Override // ai.fp2
                public final Object a(Object obj) {
                    this.f10016a.b(this.f10017b, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            uj0.c(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }

    public final /* synthetic */ Void b(boolean z10, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z10) {
            this.f11790b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
            mq2 a10 = mq2.a("oa_upload");
            a10.c("oa_failed_reqs", String.valueOf(rx1.b(sQLiteDatabase, 0)));
            a10.c("oa_total_reqs", String.valueOf(rx1.b(sQLiteDatabase, 1)));
            a10.c("oa_upload_time", String.valueOf(wg.t.k().currentTimeMillis()));
            a10.c("oa_last_successful_time", String.valueOf(rx1.c(sQLiteDatabase, 2)));
            a10.c("oa_session_id", this.f11795g.x() ? "" : this.f11793e);
            this.f11794f.a(a10);
            ArrayList<aq> a11 = rx1.a(sQLiteDatabase);
            c(sQLiteDatabase, a11);
            int size = a11.size();
            for (int i10 = 0; i10 < size; i10++) {
                aq aqVar = a11.get(i10);
                mq2 a12 = mq2.a("oa_signals");
                a12.c("oa_session_id", this.f11795g.x() ? "" : this.f11793e);
                vp H = aqVar.H();
                String valueOf = H.B() ? String.valueOf(H.G() - 1) : "-1";
                String obj = r03.b(aqVar.G(), vx1.f11401a).toString();
                a12.c("oa_sig_ts", String.valueOf(aqVar.D()));
                a12.c("oa_sig_status", String.valueOf(aqVar.X() - 1));
                a12.c("oa_sig_resp_lat", String.valueOf(aqVar.E()));
                a12.c("oa_sig_render_lat", String.valueOf(aqVar.F()));
                a12.c("oa_sig_formats", obj);
                a12.c("oa_sig_nw_type", valueOf);
                a12.c("oa_sig_wifi", String.valueOf(aqVar.Y() - 1));
                a12.c("oa_sig_airplane", String.valueOf(aqVar.Z() - 1));
                a12.c("oa_sig_data", String.valueOf(aqVar.a0() - 1));
                a12.c("oa_sig_nw_resp", String.valueOf(aqVar.I()));
                a12.c("oa_sig_offline", String.valueOf(aqVar.b0() - 1));
                a12.c("oa_sig_nw_state", String.valueOf(aqVar.J().zza()));
                if (H.C() && H.B() && H.G() == 2) {
                    a12.c("oa_sig_cell_type", String.valueOf(H.H() - 1));
                }
                this.f11794f.a(a12);
            }
        } else {
            ArrayList<aq> a13 = rx1.a(sQLiteDatabase);
            bq B = fq.B();
            B.v(this.f11790b.getPackageName());
            B.w(Build.MODEL);
            B.s(rx1.b(sQLiteDatabase, 0));
            B.r(a13);
            B.t(rx1.b(sQLiteDatabase, 1));
            B.u(wg.t.k().currentTimeMillis());
            B.x(rx1.c(sQLiteDatabase, 2));
            final fq n10 = B.n();
            c(sQLiteDatabase, a13);
            this.f11789a.b(new pn(n10) { // from class: ai.tx1

                /* renamed from: a  reason: collision with root package name */
                public final fq f10500a;

                {
                    this.f10500a = n10;
                }

                @Override // ai.pn
                public final void a(fp fpVar) {
                    fpVar.z(this.f10500a);
                }
            });
            qq B2 = rq.B();
            B2.r(this.f11792d.f13014x);
            B2.s(this.f11792d.f13015y);
            B2.t(true == this.f11792d.f13016z ? 0 : 2);
            final rq n11 = B2.n();
            this.f11789a.b(new pn(n11) { // from class: ai.ux1

                /* renamed from: a  reason: collision with root package name */
                public final rq f10869a;

                {
                    this.f10869a = n11;
                }

                @Override // ai.pn
                public final void a(fp fpVar) {
                    rq rqVar = this.f10869a;
                    xo w10 = fpVar.v().w();
                    w10.s(rqVar);
                    fpVar.w(w10);
                }
            });
            this.f11789a.c(10004);
        }
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
