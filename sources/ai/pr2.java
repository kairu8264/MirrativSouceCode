package ai;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pr2 {

    /* renamed from: a  reason: collision with root package name */
    public final wr2 f8534a;

    /* renamed from: b  reason: collision with root package name */
    public final wr2 f8535b;

    /* renamed from: c  reason: collision with root package name */
    public final tr2 f8536c;

    /* renamed from: d  reason: collision with root package name */
    public final vr2 f8537d;

    public pr2(tr2 tr2Var, vr2 vr2Var, wr2 wr2Var, wr2 wr2Var2, boolean z10) {
        this.f8536c = tr2Var;
        this.f8537d = vr2Var;
        this.f8534a = wr2Var;
        if (wr2Var2 == null) {
            this.f8535b = wr2.NONE;
        } else {
            this.f8535b = wr2Var2;
        }
    }

    public static pr2 a(tr2 tr2Var, vr2 vr2Var, wr2 wr2Var, wr2 wr2Var2, boolean z10) {
        xs2.a(vr2Var, "ImpressionType is null");
        xs2.a(wr2Var, "Impression owner is null");
        if (wr2Var != wr2.NONE) {
            if (tr2Var == tr2.DEFINED_BY_JAVASCRIPT && wr2Var == wr2.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (vr2Var == vr2.DEFINED_BY_JAVASCRIPT && wr2Var == wr2.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new pr2(tr2Var, vr2Var, wr2Var, wr2Var2, true);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        vs2.c(jSONObject, "impressionOwner", this.f8534a);
        if (this.f8537d != null) {
            vs2.c(jSONObject, "mediaEventsOwner", this.f8535b);
            vs2.c(jSONObject, "creativeType", this.f8536c);
            vs2.c(jSONObject, "impressionType", this.f8537d);
        } else {
            vs2.c(jSONObject, "videoEventsOwner", this.f8535b);
        }
        vs2.c(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
