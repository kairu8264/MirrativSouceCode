package o7;

import java.io.File;
import q7.a;

/* loaded from: classes.dex */
public class e<DataType> implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final m7.d<DataType> f44142a;

    /* renamed from: b  reason: collision with root package name */
    public final DataType f44143b;

    /* renamed from: c  reason: collision with root package name */
    public final m7.h f44144c;

    public e(m7.d<DataType> dVar, DataType datatype, m7.h hVar) {
        this.f44142a = dVar;
        this.f44143b = datatype;
        this.f44144c = hVar;
    }

    @Override // q7.a.b
    public boolean a(File file) {
        return this.f44142a.a(this.f44143b, file, this.f44144c);
    }
}
