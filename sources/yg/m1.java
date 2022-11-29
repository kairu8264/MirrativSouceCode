package yg;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class m1 {

    /* renamed from: b  reason: collision with root package name */
    public static List<MediaCodecInfo> f61919b;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, List<Map<String, Object>>> f61918a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f61920c = new Object();

    @TargetApi(16)
    public static List<Map<String, Object>> a(String str) {
        ArrayList arrayList;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Object obj = f61920c;
        synchronized (obj) {
            Map<String, List<Map<String, Object>>> map = f61918a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            try {
                synchronized (obj) {
                    if (f61919b == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            f61919b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else {
                            int codecCount = MediaCodecList.getCodecCount();
                            f61919b = new ArrayList(codecCount);
                            for (int i10 = 0; i10 < codecCount; i10++) {
                                f61919b.add(MediaCodecList.getCodecInfoAt(i10));
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : f61919b) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            hashMap.put("profileLevels", arrayList2);
                            int i11 = Build.VERSION.SDK_INT;
                            if (i11 >= 21) {
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                hashMap.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                                hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                hashMap.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                                hashMap.put("widths", b(videoCapabilities.getSupportedWidths()));
                                hashMap.put("heights", b(videoCapabilities.getSupportedHeights()));
                            }
                            if (i11 >= 23) {
                                hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            }
                            arrayList.add(hashMap);
                        }
                    }
                    f61918a.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e10) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(MRLog.PAYLOAD_KEY_ERROR, e10.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                f61918a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    @TargetApi(21)
    public static Integer[] b(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }
}
