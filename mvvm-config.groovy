/**
 * 决定需要开启哪些库的使用，有些库是有关联的，比如 bindingCollection 引用了 recyclerView。
 * 因此即使禁用掉 recyclerView，开启 bindingCollection，也会导入 recyclerView
 *
 * 禁用掉的库，就不能使用该库的内容，正常来说在 release 打包的时候会从包中移除
 */
include {
    // 内存泄露
    leakCanary2=true
    // 应用前后台监听
    lifecycleProcess=true

    // 通常来说以上都需要为 true

    bindingCollection {
        bindingAdapter=true
        bindingAdapterRv=true
        bindingAdapterVp2=false
    }
    recyclerView=true
    material=false
    viewPager2=false

    room=false
    swipeRefreshLayout=false
    slidingPaneLayout=true
    retrofit2=true
    gson=true
    glide=true
    livePermissions=true
    paging=false
    rxJava2=false
    rxKotlin=false

    loadSir=true

    reactiveStreamsKTX=false

    natigationUiKTX=false
    natigationRuntimeKTX=false
    natigationFragmentKTX=false

    roomKTX=false
    sqliteKTX=false
    workKTX=false
    paletteKTX=false
    collectionKTX=false
}

SDKVersion {
    compileSdkVersion=29
    minSdkVersion=21
    targetSdkVersion=29
}