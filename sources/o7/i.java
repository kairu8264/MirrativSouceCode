package o7;

import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f44180a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends m7.j<DataType, ResourceType>> f44181b;

    /* renamed from: c  reason: collision with root package name */
    public final a8.e<ResourceType, Transcode> f44182c;

    /* renamed from: d  reason: collision with root package name */
    public final n3.e<List<Throwable>> f44183d;

    /* renamed from: e  reason: collision with root package name */
    public final String f44184e;

    /* loaded from: classes.dex */
    public interface a<ResourceType> {
        u<ResourceType> a(u<ResourceType> uVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends m7.j<DataType, ResourceType>> list, a8.e<ResourceType, Transcode> eVar, n3.e<List<Throwable>> eVar2) {
        this.f44180a = cls;
        this.f44181b = list;
        this.f44182c = eVar;
        this.f44183d = eVar2;
        this.f44184e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public u<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, m7.h hVar, a<ResourceType> aVar) throws GlideException {
        return this.f44182c.a(aVar.a(b(eVar, i10, i11, hVar)), hVar);
    }

    public final u<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, m7.h hVar) throws GlideException {
        List<Throwable> list = (List) i8.j.d(this.f44183d.acquire());
        try {
            return c(eVar, i10, i11, hVar, list);
        } finally {
            this.f44183d.a(list);
        }
    }

    public final u<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, m7.h hVar, List<Throwable> list) throws GlideException {
        int size = this.f44181b.size();
        u<ResourceType> uVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            m7.j<DataType, ResourceType> jVar = this.f44181b.get(i12);
            try {
                if (jVar.a(eVar.a(), hVar)) {
                    uVar = jVar.b(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e10);
                }
                list.add(e10);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f44184e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f44180a + ", decoders=" + this.f44181b + ", transcoder=" + this.f44182c + '}';
    }
}
