/**
 * Created by JT on 03/04/2017.
 */

define(function(require) {
    var interceptor = require('rest/interceptor');

    return interceptor({
        request: function (request) {
            if (request.path.indexOf('{') === -1) {
                return request;
            } else {
                request.path = request.path.split('{')[0];
                return request;
            }
        }
    });

});