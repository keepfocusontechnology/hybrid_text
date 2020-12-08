#import "HybridEditTextPlugin.h"
#if __has_include(<hybrid_edit_text/hybrid_edit_text-Swift.h>)
#import <hybrid_edit_text/hybrid_edit_text-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "hybrid_edit_text-Swift.h"
#endif

@implementation HybridEditTextPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftHybridEditTextPlugin registerWithRegistrar:registrar];
}
@end
