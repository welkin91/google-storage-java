if (window.console) {
  	console.log("Welcome to your Play application's JavaScript!");
}

var handler = {

}

$(document).ready(function () {
	$('.context.example .ui.sidebar')
		.sidebar({context: $('.context.example .bottom.segment')})
		.sidebar('attach events', '.context.example .menu .item');

	$("input:text").click(function() {
	  $(this).parent().find("input:file").click();
	});

	$('.browse_hidden:file', '.ui.action.input')
	  .on('change', function(e) {
	    var name = e.target.files[0].name;
	    $('input:text', $(e.target).parent()).val(name);
	    var x = $(e.target).parent().val(name);
	    console.log(x);
	  });

    var fileExtentionRange = '.flac';
    var MAX_SIZE = 30; // MB

    $(document).on('change', '.browse_hidden :file', function() {
        var input = $(this);

        if (navigator.appVersion.indexOf("MSIE") != -1) { // IE
            var label = input.val();

            input.trigger('fileselect', [ 1, label, 0 ]);
        } else {
            var label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
            var numFiles = input.get(0).files ? input.get(0).files.length : 1;
            var size = input.get(0).files[0].size;

            input.trigger('fileselect', [ numFiles, label, size ]);
        }
    });

    $('.browse_hidden').on('change',  function () {
        $('#input_field').val($('.browse_hidden').val());
    });

    $('#upload_submit').on('click', function () {
        $('#upload_submit').addClass('loading');
        $('#upload_submit').addClass('disabled');
        $('.hidden_upload_btn').click();
    });

    $('.browse').on('click', function () {
        $('.browse_hidden').click();
    });
    $('#input_field').on('click', function () {
        $('.browse_hidden').click();
    });
    $('#attachmentName').on('click', function () {
        $('#audioFileDescriptor').click();
    });

    $('#show_button').on('click', function () {
        $('.main_segment').hide();
        $('.loader_segment').show();
        window.location = "http://localhost:9090/list/all";
    });

    $('#upload_button').on('click', function () {
        window.location = "http://localhost:9090/";
    });

    $('.convert_btns').on('click', function () {

        var state = $(this);

        state.addClass('loading');
        state.addClass('disabled');

        var segment_id = $(this).data('segment_id');
        var class_id = '.loading_segment_' + segment_id;
        var segment_class = ".file_segment_" + segment_id;

        if ($(segment_class).hasClass('opened')) {
            $(segment_class).removeClass('opened');
            $(segment_class).removeClass('positive');
            $(segment_class).removeClass('error');
            $(segment_class).hide();
            $(class_id).html('');
            $(class_id).addClass('loading');

            state.removeClass('disabled');
            state.removeClass('loading');
            return false;
        } else {
            $(segment_class).addClass('opened');
            $(segment_class).toggle();
            var file_name = $(this).data('file_name');

            $.ajax({
                url: 'http://localhost:9000/translation/'+file_name,
                cache: true,
                type: 'GET'
            })

                .done(function( data ) {

                    var result = data.script;
                    if (result == '') {
                        result = "-- No Results Found --";
                    }

                    $(segment_class).removeClass('error');
                    $(segment_class).addClass('positive');

                    $(class_id).removeClass('loading');
                    $(class_id).html(result);
                    $(class_id).css('text-align','center');
                    $(class_id).css('overflow','auto');
                    $(class_id).css('max-height','300px');


                    state.removeClass('disabled');
                    state.removeClass('loading');
                })
                .fail( function(xhr, textStatus, errorThrown) {
                    var result = xhr.responseJSON.errorMessage;

                    $(segment_class).addClass('error');
                    $(segment_class).removeClass('positive');

                    var class_id = '.loading_segment_' + segment_id
                    $(class_id).removeClass('loading');
                    $(class_id).html(result);
                    $(class_id).css('text-align','center');

                    state.removeClass('disabled');
                    state.removeClass('loading');
                });
        }
    });
});


