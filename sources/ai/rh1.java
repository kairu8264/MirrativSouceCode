package ai;

import android.os.RemoteException;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class rh1 implements View.OnClickListener {
    public String A;
    public Long B;
    public WeakReference<View> C;

    /* renamed from: w  reason: collision with root package name */
    public final nl1 f9441w;

    /* renamed from: x  reason: collision with root package name */
    public final vh.f f9442x;

    /* renamed from: y  reason: collision with root package name */
    public d20 f9443y;

    /* renamed from: z  reason: collision with root package name */
    public r30<Object> f9444z;

    public rh1(nl1 nl1Var, vh.f fVar) {
        this.f9441w = nl1Var;
        this.f9442x = fVar;
    }

    public final void a(final d20 d20Var) {
        this.f9443y = d20Var;
        r30<Object> r30Var = this.f9444z;
        if (r30Var != null) {
            this.f9441w.f("/unconfirmedClick", r30Var);
        }
        r30<Object> r30Var2 = new r30(this, d20Var) { // from class: ai.qh1

            /* renamed from: a  reason: collision with root package name */
            public final rh1 f8949a;

            /* renamed from: b  reason: collision with root package name */
            public final d20 f8950b;

            {
                this.f8949a = this;
                this.f8950b = d20Var;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                rh1 rh1Var = this.f8949a;
                d20 d20Var2 = this.f8950b;
                try {
                    rh1Var.B = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    uj0.c("Failed to call parse unconfirmedClickTimestamp.");
                }
                rh1Var.A = (String) map.get(TtmlNode.ATTR_ID);
                String str = (String) map.get("asset_id");
                if (d20Var2 == null) {
                    uj0.a("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    d20Var2.H(str);
                } catch (RemoteException e10) {
                    uj0.i("#007 Could not call remote method.", e10);
                }
            }
        };
        this.f9444z = r30Var2;
        this.f9441w.e("/unconfirmedClick", r30Var2);
    }

    public final d20 b() {
        return this.f9443y;
    }

    public final void c() {
        if (this.f9443y == null || this.B == null) {
            return;
        }
        d();
        try {
            this.f9443y.a();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    public final void d() {
        View view;
        this.A = null;
        this.B = null;
        WeakReference<View> weakReference = this.C;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.C = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.C;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.A != null && this.B != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(TtmlNode.ATTR_ID, this.A);
            hashMap.put("time_interval", String.valueOf(this.f9442x.currentTimeMillis() - this.B.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.f9441w.g("sendMessageToNativeJs", hashMap);
        }
        d();
    }
}
