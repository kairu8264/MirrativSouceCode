package hf;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.cookpad.puree.Puree;
import com.dena.mirrorman.ChooseReceiver;
import com.dena.mirrorman.clientlog.logs.Live;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.live.LiveEndResponse;
import com.dena.mirrorman.net.api.response.live.LiveEndUserParam;
import com.dena.mirrorman.net.api.response.live.LiveOwnedResponse;
import java.util.ArrayList;
import nd.f1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final kf.m f35527a;

    /* renamed from: b  reason: collision with root package name */
    public final kf.x f35528b;

    /* renamed from: c  reason: collision with root package name */
    public df.a f35529c;

    /* renamed from: d  reason: collision with root package name */
    public int f35530d;

    /* renamed from: e  reason: collision with root package name */
    public int f35531e;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.p<MRLogger, String, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f35532w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f35533x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(2);
            this.f35532w = str;
            this.f35533x = str2;
        }

        public final void a(MRLogger mRLogger, String str) {
            jo.p.h(mRLogger, "logger");
            MRLog.Companion companion = MRLog.Companion;
            String str2 = this.f35532w;
            String str3 = this.f35533x;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SHARE_PANEL_PROCEED);
            builder.setPageId(Referer.Broadcast.SETTING);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(LogBase.SERVICE_NAME, str);
            wn.v vVar = wn.v.f59242a;
            builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str2), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, str3), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
            mRLogger.sendLog(builder.build());
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(MRLogger mRLogger, String str) {
            a(mRLogger, str);
            return wn.v.f59242a;
        }
    }

    public d0(kf.m mVar, kf.x xVar) {
        jo.p.h(mVar, "livePreference");
        jo.p.h(xVar, "userPreference");
        this.f35527a = mVar;
        this.f35528b = xVar;
    }

    public final synchronized void a() {
        this.f35529c = null;
    }

    public final boolean b() {
        return this.f35527a.W0();
    }

    public final String c() {
        return this.f35527a.b();
    }

    public final void d(LiveOwnedResponse liveOwnedResponse) {
        jo.p.h(liveOwnedResponse, "response");
        this.f35527a.J4(liveOwnedResponse.getLiveId());
        this.f35527a.u0(liveOwnedResponse.isPrivate());
        this.f35527a.l4(liveOwnedResponse.getShareUrl());
        if (liveOwnedResponse.isPrivate()) {
            return;
        }
        String title = liveOwnedResponse.getTitle();
        if (title == null) {
            this.f35527a.z3("");
        } else {
            this.f35527a.z3(title);
        }
        String description = liveOwnedResponse.getDescription();
        if (description == null) {
            this.f35527a.L2("");
        } else {
            this.f35527a.L2(description);
        }
        App.AppParams app = !of.b.a(liveOwnedResponse.getTimeline()) ? liveOwnedResponse.getTimeline().get(liveOwnedResponse.getTimeline().size() - 1).getApp() : null;
        if (app == null) {
            this.f35527a.v0("");
            this.f35527a.A4("");
            this.f35527a.D3("");
        } else {
            this.f35527a.v0(app.getAppId());
            this.f35527a.A4(app.getIconUrl());
            this.f35527a.D3(app.getTitle());
            this.f35527a.x2(app.getShortTitle());
        }
        if (liveOwnedResponse.getAppUserDetail() != null) {
            kf.m mVar = this.f35527a;
            AppUserDetailResponse appUserDetail = liveOwnedResponse.getAppUserDetail();
            jo.p.e(appUserDetail);
            mVar.s2(appUserDetail.getUserId());
            return;
        }
        this.f35527a.s2("");
    }

    public final synchronized df.a e() {
        return this.f35529c;
    }

    public final void f(LiveEndResponse liveEndResponse) {
        jo.p.h(liveEndResponse, "liveEndResponse");
        if (liveEndResponse.getUser() != null) {
            LiveEndUserParam user = liveEndResponse.getUser();
            jo.p.e(user);
            if (user.getTotalViewerNumHistory() != null) {
                if (liveEndResponse.getLive() == null) {
                    g9.a.c(new NullPointerException("live is required"));
                    return;
                }
                df.a aVar = new df.a(liveEndResponse);
                synchronized (this) {
                    this.f35529c = aVar;
                    wn.v vVar = wn.v.f59242a;
                }
                dq.c.c().l(aVar);
                return;
            }
        }
        g9.a.c(new NullPointerException("user is required"));
    }

    public final ArrayList<String> g() {
        ArrayList<String> arrayList = new ArrayList<>();
        String r32 = this.f35527a.r3();
        if (TextUtils.isEmpty(r32)) {
            return arrayList;
        }
        try {
            Object j10 = new xm.e().j(r32, of.n.q().getType());
            jo.p.g(j10, "Gson().fromJson(json, listType<String>().type)");
            return (ArrayList) j10;
        } catch (Error e10) {
            g9.a.c(e10);
            return arrayList;
        } catch (Exception e11) {
            g9.a.c(e11);
            return arrayList;
        }
    }

    public final void h(Context context) {
        ClipData clipData = new ClipData(new ClipDescription("text_data", new String[]{"text/plain"}), new ClipData.Item(this.f35527a.q3()));
        Object systemService = context.getSystemService("clipboard");
        jo.p.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(clipData);
        of.n.A(context, f1.text_get_link, false);
        Puree.d(new Live.Share(this.f35527a.b(), this.f35528b.T4(), this.f35528b.t4(), this.f35527a.getTitle(), this.f35527a.W0() ? Live.LIVE_TYPE_PRIVATE : "open", this.f35527a.h(), Live.SHARE_TYPE_COPY, ""));
    }

    public final void i(int i10, int i11) {
        this.f35530d = i10;
        this.f35531e = i11;
    }

    public final void j(Context context, String str, String str2) {
        jo.p.h(context, "context");
        String q32 = this.f35527a.q3();
        String b10 = this.f35527a.b();
        String T4 = this.f35528b.T4();
        try {
            Intent putExtra = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", q32);
            jo.p.g(putExtra, "Intent(Intent.ACTION_SEN…a(Intent.EXTRA_TEXT, url)");
            context.startActivity(Intent.createChooser(putExtra, context.getString(f1.f41999y1), PendingIntent.getBroadcast(context, 0, ChooseReceiver.f25051x.a(context, new a(b10, T4)), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728).getIntentSender()).addFlags(268435456));
            Puree.d(new Live.Share(this.f35527a.b(), this.f35528b.T4(), this.f35528b.t4(), this.f35527a.getTitle(), this.f35527a.W0() ? Live.LIVE_TYPE_PRIVATE : "open", this.f35527a.h(), str, str2));
        } catch (ActivityNotFoundException unused) {
            h(context);
        }
    }
}
