package kg;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* loaded from: classes3.dex */
public class a implements y {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38739a;

    /* renamed from: b  reason: collision with root package name */
    public final lg.d f38740b;

    /* renamed from: c  reason: collision with root package name */
    public AlarmManager f38741c;

    /* renamed from: d  reason: collision with root package name */
    public final g f38742d;

    /* renamed from: e  reason: collision with root package name */
    public final ng.a f38743e;

    public a(Context context, lg.d dVar, ng.a aVar, g gVar) {
        this(context, dVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    @Override // kg.y
    public void a(cg.o oVar, int i10) {
        b(oVar, i10, false);
    }

    @Override // kg.y
    public void b(cg.o oVar, int i10, boolean z10) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", oVar.b());
        builder.appendQueryParameter("priority", String.valueOf(og.a.a(oVar.d())));
        if (oVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(oVar.c(), 0));
        }
        Intent intent = new Intent(this.f38739a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i10);
        if (!z10 && c(intent)) {
            hg.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long Q = this.f38740b.Q(oVar);
        long g10 = this.f38742d.g(oVar.d(), Q, i10);
        hg.a.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", oVar, Long.valueOf(g10), Long.valueOf(Q), Integer.valueOf(i10));
        this.f38741c.set(3, this.f38743e.a() + g10, PendingIntent.getBroadcast(this.f38739a, 0, intent, 0));
    }

    public boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.f38739a, 0, intent, 536870912) != null;
    }

    public a(Context context, lg.d dVar, AlarmManager alarmManager, ng.a aVar, g gVar) {
        this.f38739a = context;
        this.f38740b = dVar;
        this.f38741c = alarmManager;
        this.f38743e = aVar;
        this.f38742d = gVar;
    }
}
