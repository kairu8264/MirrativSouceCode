package ai;

/* loaded from: classes3.dex */
public final /* synthetic */ class g63 implements pf3 {

    /* renamed from: a  reason: collision with root package name */
    public static final pf3 f4354a = new g63();

    @Override // ai.pf3
    public final int a(Object obj) {
        int i10 = qg3.f8945d;
        String str = ((pz2) obj).f8747a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (sb.f9778a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
