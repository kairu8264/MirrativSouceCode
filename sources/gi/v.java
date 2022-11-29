package gi;

import com.google.firebase.encoders.EncodingException;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements ql.d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ v f33624a = new v();

    @Override // ql.b
    public final void a(Object obj, ql.e eVar) {
        int i10 = w.f33626e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new EncodingException(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}
