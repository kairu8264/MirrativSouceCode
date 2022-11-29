package ai;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class im {

    /* renamed from: a  reason: collision with root package name */
    public final xl f5284a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5285b;

    /* renamed from: c  reason: collision with root package name */
    public String f5286c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5287d;

    public im(int i10, int i11, int i12) {
        this.f5285b = i10;
        i11 = (i11 > 64 || i11 < 0) ? 64 : i11;
        if (i12 <= 0) {
            this.f5287d = 1;
        } else {
            this.f5287d = i12;
        }
        this.f5284a = new gm(i11);
    }

    public final String a(ArrayList<String> arrayList, ArrayList<wl> arrayList2) {
        Collections.sort(arrayList2, new hm(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            String[] split = Normalizer.normalize(arrayList.get(arrayList2.get(i10).e()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.contains("'")) {
                        StringBuilder sb2 = new StringBuilder(str);
                        int i11 = 1;
                        boolean z10 = false;
                        while (true) {
                            int i12 = i11 + 2;
                            if (i12 > sb2.length()) {
                                break;
                            }
                            if (sb2.charAt(i11) == '\'') {
                                if (sb2.charAt(i11 - 1) != ' ') {
                                    int i13 = i11 + 1;
                                    if ((sb2.charAt(i13) == 's' || sb2.charAt(i13) == 'S') && (i12 == sb2.length() || sb2.charAt(i12) == ' ')) {
                                        sb2.insert(i11, ' ');
                                        i11 = i12;
                                        z10 = true;
                                    }
                                }
                                sb2.setCharAt(i11, ' ');
                                z10 = true;
                            }
                            i11++;
                        }
                        String sb3 = z10 ? sb2.toString() : null;
                        if (sb3 != null) {
                            this.f5286c = sb3;
                            str = sb3;
                        }
                    }
                    String[] b10 = bm.b(str, true);
                    if (b10.length >= this.f5287d) {
                        for (int i14 = 0; i14 < b10.length; i14++) {
                            String str2 = "";
                            for (int i15 = 0; i15 < this.f5287d; i15++) {
                                int i16 = i14 + i15;
                                if (i16 >= b10.length) {
                                    break;
                                }
                                if (i15 > 0) {
                                    str2 = String.valueOf(str2).concat(" ");
                                }
                                String valueOf = String.valueOf(str2);
                                String valueOf2 = String.valueOf(b10[i16]);
                                str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.f5285b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.f5285b) {
                            break loop0;
                        }
                    }
                }
                continue;
            }
        }
        zl zlVar = new zl();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zlVar.f13025b.write(this.f5284a.a((String) it.next()));
            } catch (IOException e10) {
                uj0.d("Error while writing hash to byteStream", e10);
            }
        }
        return zlVar.toString();
    }
}
