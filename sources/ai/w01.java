package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class w01<AdT> implements x01<AdT> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ry1<AdT>> f11439a;

    public w01(Map<String, ry1<AdT>> map) {
        this.f11439a = map;
    }

    @Override // ai.x01
    public final ry1<AdT> a(int i10, String str) {
        return this.f11439a.get(str);
    }
}
