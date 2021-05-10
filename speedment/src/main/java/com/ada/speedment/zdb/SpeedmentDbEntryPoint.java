package com.ada.speedment.zdb;

/**
 * The entry point for the {@link com.speedment.runtime.config.Project} named
 * public
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author ada
 */
public final class SpeedmentDbEntryPoint {
    
    public static void main(String... args) {
        final SpeedmentDbApplication application = new SpeedmentDbApplicationBuilder()
            // Add bundles, auth information, etc.
            .build();
        
        // Application logic goes here
        
        application.stop();
    }
}