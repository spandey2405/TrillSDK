var exec = require('cordova/exec');

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'TrillSDK', 'coolMethod', [arg0]);
};

module.exports.init = function(arg0, success, error) {
    exec(success, error, 'TrillSDK', 'init', [arg0]);
}