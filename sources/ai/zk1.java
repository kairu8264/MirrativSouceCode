package ai;

import android.os.RemoteException;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zk1 implements r30<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final n10 f13021a;

    /* renamed from: b  reason: collision with root package name */
    public final nl1 f13022b;

    /* renamed from: c  reason: collision with root package name */
    public final kn3<vk1> f13023c;

    public zk1(zg1 zg1Var, og1 og1Var, nl1 nl1Var, kn3<vk1> kn3Var) {
        this.f13021a = zg1Var.g(og1Var.q());
        this.f13022b = nl1Var;
        this.f13023c = kn3Var;
    }

    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f13021a.n3(this.f13023c.zzb(), str);
        } catch (RemoteException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40);
            sb2.append("Failed to call onCustomClick for asset ");
            sb2.append(str);
            sb2.append(TopicConstant.SEPARATOR);
            uj0.g(sb2.toString(), e10);
        }
    }

    public final void b() {
        if (this.f13021a == null) {
            return;
        }
        this.f13022b.e("/nativeAdCustomClick", this);
    }
}
