package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibsInPluginsBlock extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final HiltLibraryAccessors laccForHiltLibraryAccessors = new HiltLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final Okhttp3LibraryAccessors laccForOkhttp3LibraryAccessors = new Okhttp3LibraryAccessors(owner);
    private final RetrofitLibraryAccessors laccForRetrofitLibraryAccessors = new RetrofitLibraryAccessors(owner);
    private final RoomLibraryAccessors laccForRoomLibraryAccessors = new RoomLibraryAccessors(owner);
    private final SecurityLibraryAccessors laccForSecurityLibraryAccessors = new SecurityLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibsInPluginsBlock(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>gson</b> with <b>com.google.code.gson:gson</b> coordinates and
     * with version reference <b>gson</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Provider<MinimalExternalModuleDependency> getGson() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return create("gson");
    }

    /**
     * Dependency provider for <b>junit</b> with <b>junit:junit</b> coordinates and
     * with version reference <b>junit</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Provider<MinimalExternalModuleDependency> getJunit() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return create("junit");
    }

    /**
     * Dependency provider for <b>kotest</b> with <b>io.kotest:kotest-runner-junit5</b> coordinates and
     * with version reference <b>kotest</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Provider<MinimalExternalModuleDependency> getKotest() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return create("kotest");
    }

    /**
     * Dependency provider for <b>mockk</b> with <b>io.mockk:mockk</b> coordinates and
     * with version reference <b>mockk</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Provider<MinimalExternalModuleDependency> getMockk() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return create("mockk");
    }

    /**
     * Dependency provider for <b>timber</b> with <b>com.jakewharton.timber:timber</b> coordinates and
     * with version reference <b>timber</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Provider<MinimalExternalModuleDependency> getTimber() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return create("timber");
    }

    /**
     * Dependency provider for <b>turbine</b> with <b>app.cash.turbine:turbine</b> coordinates and
     * with version reference <b>turbine</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Provider<MinimalExternalModuleDependency> getTurbine() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return create("turbine");
    }

    /**
     * Group of libraries at <b>androidx</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public AndroidxLibraryAccessors getAndroidx() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Group of libraries at <b>hilt</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public HiltLibraryAccessors getHilt() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForHiltLibraryAccessors;
    }

    /**
     * Group of libraries at <b>kotlinx</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public KotlinxLibraryAccessors getKotlinx() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForKotlinxLibraryAccessors;
    }

    /**
     * Group of libraries at <b>okhttp3</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public Okhttp3LibraryAccessors getOkhttp3() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForOkhttp3LibraryAccessors;
    }

    /**
     * Group of libraries at <b>retrofit</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public RetrofitLibraryAccessors getRetrofit() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForRetrofitLibraryAccessors;
    }

    /**
     * Group of libraries at <b>room</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public RoomLibraryAccessors getRoom() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForRoomLibraryAccessors;
    }

    /**
     * Group of libraries at <b>security</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public SecurityLibraryAccessors getSecurity() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForSecurityLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BundleAccessors getBundles() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxActivityLibraryAccessors laccForAndroidxActivityLibraryAccessors = new AndroidxActivityLibraryAccessors(owner);
        private final AndroidxComposeLibraryAccessors laccForAndroidxComposeLibraryAccessors = new AndroidxComposeLibraryAccessors(owner);
        private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);
        private final AndroidxEspressoLibraryAccessors laccForAndroidxEspressoLibraryAccessors = new AndroidxEspressoLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
        private final AndroidxNavigationLibraryAccessors laccForAndroidxNavigationLibraryAccessors = new AndroidxNavigationLibraryAccessors(owner);
        private final AndroidxUiLibraryAccessors laccForAndroidxUiLibraryAccessors = new AndroidxUiLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>junit</b> with <b>androidx.test.ext:junit</b> coordinates and
         * with version reference <b>junitVersion</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJunit() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.junit");
        }

        /**
         * Dependency provider for <b>material3</b> with <b>androidx.compose.material3:material3</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getMaterial3() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.material3");
        }

        /**
         * Group of libraries at <b>androidx.activity</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxActivityLibraryAccessors getActivity() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxActivityLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.compose</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxComposeLibraryAccessors getCompose() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxComposeLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.core</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxCoreLibraryAccessors getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxCoreLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.espresso</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxEspressoLibraryAccessors getEspresso() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxEspressoLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.lifecycle</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxLifecycleLibraryAccessors getLifecycle() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxLifecycleLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.navigation</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxNavigationLibraryAccessors getNavigation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxNavigationLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.ui</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxUiLibraryAccessors getUi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxUiLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxActivityLibraryAccessors extends SubDependencyFactory {

        public AndroidxActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>androidx.activity:activity-compose</b> coordinates and
         * with version reference <b>activityCompose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCompose() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.activity.compose");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxComposeLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>androidx.compose:compose-bom</b> coordinates and
         * with version reference <b>composeBom</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.compose.bom");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ktx</b> with <b>androidx.core:core-ktx</b> coordinates and
         * with version reference <b>coreKtx</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getKtx() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.core.ktx");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxEspressoLibraryAccessors extends SubDependencyFactory {

        public AndroidxEspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>androidx.test.espresso:espresso-core</b> coordinates and
         * with version reference <b>espressoCore</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.espresso.core");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {
        private final AndroidxLifecycleRuntimeLibraryAccessors laccForAndroidxLifecycleRuntimeLibraryAccessors = new AndroidxLifecycleRuntimeLibraryAccessors(owner);
        private final AndroidxLifecycleViewmodelLibraryAccessors laccForAndroidxLifecycleViewmodelLibraryAccessors = new AndroidxLifecycleViewmodelLibraryAccessors(owner);

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>androidx.lifecycle.runtime</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxLifecycleRuntimeLibraryAccessors getRuntime() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxLifecycleRuntimeLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.lifecycle.viewmodel</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxLifecycleViewmodelLibraryAccessors getViewmodel() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxLifecycleViewmodelLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxLifecycleRuntimeLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ktx</b> with <b>androidx.lifecycle:lifecycle-runtime-ktx</b> coordinates and
         * with version reference <b>lifecycleRuntimeKtx</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getKtx() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.lifecycle.runtime.ktx");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxLifecycleViewmodelLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>androidx.lifecycle:lifecycle-viewmodel-compose</b> coordinates and
         * with version reference <b>lifecycleRuntimeKtx</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCompose() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.lifecycle.viewmodel.compose");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxNavigationLibraryAccessors extends SubDependencyFactory {

        public AndroidxNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>androidx.navigation:navigation-compose</b> coordinates and
         * with version reference <b>navigationCompose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCompose() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.navigation.compose");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxUiTestLibraryAccessors laccForAndroidxUiTestLibraryAccessors = new AndroidxUiTestLibraryAccessors(owner);
        private final AndroidxUiToolingLibraryAccessors laccForAndroidxUiToolingLibraryAccessors = new AndroidxUiToolingLibraryAccessors(owner);

        public AndroidxUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ui</b> with <b>androidx.compose.ui:ui</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.ui");
        }

        /**
         * Dependency provider for <b>graphics</b> with <b>androidx.compose.ui:ui-graphics</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getGraphics() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.ui.graphics");
        }

        /**
         * Group of libraries at <b>androidx.ui.test</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxUiTestLibraryAccessors getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxUiTestLibraryAccessors;
        }

        /**
         * Group of libraries at <b>androidx.ui.tooling</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxUiToolingLibraryAccessors getTooling() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxUiToolingLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxUiTestLibraryAccessors extends SubDependencyFactory {

        public AndroidxUiTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>junit4</b> with <b>androidx.compose.ui:ui-test-junit4</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJunit4() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.ui.test.junit4");
        }

        /**
         * Dependency provider for <b>manifest</b> with <b>androidx.compose.ui:ui-test-manifest</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getManifest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.ui.test.manifest");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxUiToolingLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxUiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>tooling</b> with <b>androidx.compose.ui:ui-tooling</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.ui.tooling");
        }

        /**
         * Dependency provider for <b>preview</b> with <b>androidx.compose.ui:ui-tooling-preview</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getPreview() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("androidx.ui.tooling.preview");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class HiltLibraryAccessors extends SubDependencyFactory {
        private final HiltNavigationLibraryAccessors laccForHiltNavigationLibraryAccessors = new HiltNavigationLibraryAccessors(owner);

        public HiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>android</b> with <b>com.google.dagger:hilt-android</b> coordinates and
         * with version reference <b>hilt</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAndroid() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("hilt.android");
        }

        /**
         * Dependency provider for <b>compiler</b> with <b>com.google.dagger:hilt-compiler</b> coordinates and
         * with version reference <b>hilt</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCompiler() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("hilt.compiler");
        }

        /**
         * Group of libraries at <b>hilt.navigation</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public HiltNavigationLibraryAccessors getNavigation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForHiltNavigationLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class HiltNavigationLibraryAccessors extends SubDependencyFactory {

        public HiltNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>androidx.hilt:hilt-navigation-compose</b> coordinates and
         * with version reference <b>hiltNavigationCompose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCompose() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("hilt.navigation.compose");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);
        private final KotlinxSerializationLibraryAccessors laccForKotlinxSerializationLibraryAccessors = new KotlinxSerializationLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>kotlinx.coroutines</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public KotlinxCoroutinesLibraryAccessors getCoroutines() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForKotlinxCoroutinesLibraryAccessors;
        }

        /**
         * Group of libraries at <b>kotlinx.serialization</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public KotlinxSerializationLibraryAccessors getSerialization() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForKotlinxSerializationLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>android</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-android</b> coordinates and
         * with version reference <b>kotlinCoroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAndroid() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("kotlinx.coroutines.android");
        }

        /**
         * Dependency provider for <b>test</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-test</b> coordinates and
         * with version reference <b>kotlinCoroutines</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("kotlinx.coroutines.test");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class KotlinxSerializationLibraryAccessors extends SubDependencyFactory {

        public KotlinxSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>json</b> with <b>org.jetbrains.kotlinx:kotlinx-serialization-json</b> coordinates and
         * with version reference <b>kotlinSerialization</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("kotlinx.serialization.json");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class Okhttp3LibraryAccessors extends SubDependencyFactory {

        public Okhttp3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>logging</b> with <b>com.squareup.okhttp3:logging-interceptor</b> coordinates and
         * with version reference <b>logging.interceptor</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getLogging() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("okhttp3.logging");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class RetrofitLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final RetrofitConverterLibraryAccessors laccForRetrofitConverterLibraryAccessors = new RetrofitConverterLibraryAccessors(owner);

        public RetrofitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>retrofit</b> with <b>com.squareup.retrofit2:retrofit</b> coordinates and
         * with version reference <b>retrofit</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("retrofit");
        }

        /**
         * Group of libraries at <b>retrofit.converter</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public RetrofitConverterLibraryAccessors getConverter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForRetrofitConverterLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class RetrofitConverterLibraryAccessors extends SubDependencyFactory {

        public RetrofitConverterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>gson</b> with <b>com.squareup.retrofit2:converter-gson</b> coordinates and
         * with version reference <b>retrofit</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getGson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("retrofit.converter.gson");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class RoomLibraryAccessors extends SubDependencyFactory {

        public RoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compiler</b> with <b>androidx.room:room-compiler</b> coordinates and
         * with version reference <b>room</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCompiler() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("room.compiler");
        }

        /**
         * Dependency provider for <b>runtime</b> with <b>androidx.room:room-runtime</b> coordinates and
         * with version reference <b>room</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getRuntime() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("room.runtime");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SecurityLibraryAccessors extends SubDependencyFactory {
        private final SecurityCryptoLibraryAccessors laccForSecurityCryptoLibraryAccessors = new SecurityCryptoLibraryAccessors(owner);

        public SecurityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>security.crypto</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SecurityCryptoLibraryAccessors getCrypto() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSecurityCryptoLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SecurityCryptoLibraryAccessors extends SubDependencyFactory {
        private final SecurityCryptoDatastoreLibraryAccessors laccForSecurityCryptoDatastoreLibraryAccessors = new SecurityCryptoDatastoreLibraryAccessors(owner);

        public SecurityCryptoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>security.crypto.datastore</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SecurityCryptoDatastoreLibraryAccessors getDatastore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSecurityCryptoDatastoreLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SecurityCryptoDatastoreLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public SecurityCryptoDatastoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>datastore</b> with <b>io.github.osipxd:security-crypto-datastore</b> coordinates and
         * with version reference <b>securityCryptoDatastore</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("security.crypto.datastore");
        }

        /**
         * Dependency provider for <b>preferences</b> with <b>io.github.osipxd:security-crypto-datastore-preferences</b> coordinates and
         * with version reference <b>securityCryptoDatastore</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getPreferences() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("security.crypto.datastore.preferences");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final LoggingVersionAccessors vaccForLoggingVersionAccessors = new LoggingVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>activityCompose</b> with value <b>1.9.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getActivityCompose() { return getVersion("activityCompose"); }

        /**
         * Version alias <b>agp</b> with value <b>8.5.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAgp() { return getVersion("agp"); }

        /**
         * Version alias <b>compileSdk</b> with value <b>34</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompileSdk() { return getVersion("compileSdk"); }

        /**
         * Version alias <b>composeBom</b> with value <b>2024.06.00</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getComposeBom() { return getVersion("composeBom"); }

        /**
         * Version alias <b>coreKtx</b> with value <b>1.13.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCoreKtx() { return getVersion("coreKtx"); }

        /**
         * Version alias <b>espressoCore</b> with value <b>3.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getEspressoCore() { return getVersion("espressoCore"); }

        /**
         * Version alias <b>gson</b> with value <b>2.10.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getGson() { return getVersion("gson"); }

        /**
         * Version alias <b>hilt</b> with value <b>2.49</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHilt() { return getVersion("hilt"); }

        /**
         * Version alias <b>hiltNavigationCompose</b> with value <b>1.2.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHiltNavigationCompose() { return getVersion("hiltNavigationCompose"); }

        /**
         * Version alias <b>junit</b> with value <b>4.13.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunit() { return getVersion("junit"); }

        /**
         * Version alias <b>junitVersion</b> with value <b>1.2.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunitVersion() { return getVersion("junitVersion"); }

        /**
         * Version alias <b>kotest</b> with value <b>5.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotest() { return getVersion("kotest"); }

        /**
         * Version alias <b>kotlin</b> with value <b>1.9.24</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlin() { return getVersion("kotlin"); }

        /**
         * Version alias <b>kotlinCoroutines</b> with value <b>1.8.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlinCoroutines() { return getVersion("kotlinCoroutines"); }

        /**
         * Version alias <b>kotlinSerialization</b> with value <b>1.6.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlinSerialization() { return getVersion("kotlinSerialization"); }

        /**
         * Version alias <b>lifecycleRuntimeKtx</b> with value <b>2.8.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLifecycleRuntimeKtx() { return getVersion("lifecycleRuntimeKtx"); }

        /**
         * Version alias <b>minSdk</b> with value <b>28</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMinSdk() { return getVersion("minSdk"); }

        /**
         * Version alias <b>mockk</b> with value <b>1.12.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMockk() { return getVersion("mockk"); }

        /**
         * Version alias <b>navigationCompose</b> with value <b>2.8.0-beta05</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getNavigationCompose() { return getVersion("navigationCompose"); }

        /**
         * Version alias <b>retrofit</b> with value <b>2.9.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getRetrofit() { return getVersion("retrofit"); }

        /**
         * Version alias <b>room</b> with value <b>2.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getRoom() { return getVersion("room"); }

        /**
         * Version alias <b>securityCryptoDatastore</b> with value <b>1.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSecurityCryptoDatastore() { return getVersion("securityCryptoDatastore"); }

        /**
         * Version alias <b>targetSdk</b> with value <b>34</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTargetSdk() { return getVersion("targetSdk"); }

        /**
         * Version alias <b>timber</b> with value <b>5.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTimber() { return getVersion("timber"); }

        /**
         * Version alias <b>turbine</b> with value <b>1.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getTurbine() { return getVersion("turbine"); }

        /**
         * Group of versions at <b>versions.logging</b>
         */
        public LoggingVersionAccessors getLogging() {
            return vaccForLoggingVersionAccessors;
        }

    }

    public static class LoggingVersionAccessors extends VersionFactory  {

        public LoggingVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>logging.interceptor</b> with value <b>4.11.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getInterceptor() { return getVersion("logging.interceptor"); }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final AndroidPluginAccessors paccForAndroidPluginAccessors = new AndroidPluginAccessors(providers, config);
        private final HiltPluginAccessors paccForHiltPluginAccessors = new HiltPluginAccessors(providers, config);
        private final JetbrainsPluginAccessors paccForJetbrainsPluginAccessors = new JetbrainsPluginAccessors(providers, config);
        private final KotlinPluginAccessors paccForKotlinPluginAccessors = new KotlinPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of plugins at <b>plugins.android</b>
         */
        public AndroidPluginAccessors getAndroid() {
            return paccForAndroidPluginAccessors;
        }

        /**
         * Group of plugins at <b>plugins.hilt</b>
         */
        public HiltPluginAccessors getHilt() {
            return paccForHiltPluginAccessors;
        }

        /**
         * Group of plugins at <b>plugins.jetbrains</b>
         */
        public JetbrainsPluginAccessors getJetbrains() {
            return paccForJetbrainsPluginAccessors;
        }

        /**
         * Group of plugins at <b>plugins.kotlin</b>
         */
        public KotlinPluginAccessors getKotlin() {
            return paccForKotlinPluginAccessors;
        }

    }

    public static class AndroidPluginAccessors extends PluginFactory {

        public AndroidPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>android.application</b> with plugin id <b>com.android.application</b> and
         * with version reference <b>agp</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getApplication() { return createPlugin("android.application"); }

        /**
         * Plugin provider for <b>android.library</b> with plugin id <b>com.android.library</b> and
         * with version reference <b>agp</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getLibrary() { return createPlugin("android.library"); }

    }

    public static class HiltPluginAccessors extends PluginFactory {

        public HiltPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>hilt.android</b> with plugin id <b>com.google.dagger.hilt.android</b> and
         * with version reference <b>hilt</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getAndroid() { return createPlugin("hilt.android"); }

    }

    public static class JetbrainsPluginAccessors extends PluginFactory {
        private final JetbrainsKotlinPluginAccessors paccForJetbrainsKotlinPluginAccessors = new JetbrainsKotlinPluginAccessors(providers, config);

        public JetbrainsPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of plugins at <b>plugins.jetbrains.kotlin</b>
         */
        public JetbrainsKotlinPluginAccessors getKotlin() {
            return paccForJetbrainsKotlinPluginAccessors;
        }

    }

    public static class JetbrainsKotlinPluginAccessors extends PluginFactory {

        public JetbrainsKotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>jetbrains.kotlin.android</b> with plugin id <b>org.jetbrains.kotlin.android</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getAndroid() { return createPlugin("jetbrains.kotlin.android"); }

    }

    public static class KotlinPluginAccessors extends PluginFactory {

        public KotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>kotlin.kapt</b> with plugin id <b>org.jetbrains.kotlin.kapt</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getKapt() { return createPlugin("kotlin.kapt"); }

        /**
         * Plugin provider for <b>kotlin.seriazation</b> with plugin id <b>org.jetbrains.kotlin.plugin.serialization</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getSeriazation() { return createPlugin("kotlin.seriazation"); }

    }

}
