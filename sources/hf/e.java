package hf;

import com.dena.mirrorman.net.bcsvr.BcsvrChannel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final j f35534a;

    /* renamed from: b  reason: collision with root package name */
    public final q8.a f35535b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, BcsvrChannel> f35536c;

    /* loaded from: classes2.dex */
    public static final class a implements BcsvrChannel.OnMessageReceivedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f35537a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f35538b;

        public a(String str, e eVar) {
            this.f35537a = str;
            this.f35538b = eVar;
        }

        @Override // com.dena.mirrorman.net.bcsvr.BcsvrChannel.OnMessageReceivedListener
        public void onMessageReceived(String str) {
            jo.p.h(str, "json");
            nd.r0.f42205a.a().a(this.f35537a, str);
            ce.l a10 = this.f35538b.f35534a.a(this.f35537a, str);
            if (a10 != null) {
                this.f35538b.f35535b.a(a10);
            }
        }
    }

    public e(j jVar, q8.a aVar) {
        jo.p.h(jVar, "createBcsvrEvent");
        jo.p.h(aVar, "dispatcher");
        this.f35534a = jVar;
        this.f35535b = aVar;
        this.f35536c = new HashMap();
    }

    public static /* synthetic */ BcsvrChannel e(e eVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return eVar.d(str, z10);
    }

    public final synchronized void c(String str) {
        jo.p.h(str, "name");
        BcsvrChannel remove = this.f35536c.remove(str);
        if (remove != null) {
            try {
                remove.close();
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized BcsvrChannel d(String str, boolean z10) {
        jo.p.h(str, "channelName");
        BcsvrChannel bcsvrChannel = this.f35536c.get(str);
        if (bcsvrChannel == null || !bcsvrChannel.isOpen()) {
            BcsvrChannel bcsvrChannel2 = new BcsvrChannel();
            this.f35536c.put(str, bcsvrChannel2);
            if (z10) {
                bcsvrChannel2.addOnMessageListener(new a(str, this));
            }
            return bcsvrChannel2;
        }
        return bcsvrChannel;
    }
}
