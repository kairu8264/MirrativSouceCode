package o7;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o7.i;

/* loaded from: classes.dex */
public class s<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<Data> f44242a;

    /* renamed from: b  reason: collision with root package name */
    public final n3.e<List<Throwable>> f44243b;

    /* renamed from: c  reason: collision with root package name */
    public final List<? extends i<Data, ResourceType, Transcode>> f44244c;

    /* renamed from: d  reason: collision with root package name */
    public final String f44245d;

    public s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, n3.e<List<Throwable>> eVar) {
        this.f44242a = cls;
        this.f44243b = eVar;
        this.f44244c = (List) i8.j.c(list);
        this.f44245d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public u<Transcode> a(com.bumptech.glide.load.data.e<Data> eVar, m7.h hVar, int i10, int i11, i.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) i8.j.d(this.f44243b.acquire());
        try {
            return b(eVar, hVar, i10, i11, aVar, list);
        } finally {
            this.f44243b.a(list);
        }
    }

    public final u<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, m7.h hVar, int i10, int i11, i.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f44244c.size();
        u<Transcode> uVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                uVar = this.f44244c.get(i12).a(eVar, i10, i11, hVar, aVar);
            } catch (GlideException e10) {
                list.add(e10);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f44245d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f44244c.toArray()) + '}';
    }
}
