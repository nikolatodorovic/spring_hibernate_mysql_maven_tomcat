<div class="navbar navbar-inverse navbar-fixed-top">
  <div class="navbar-inner">
    <div class="container">
      <button class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="brand">Test</a>
      <div class="nav-collapse collapse">
        <ul class="nav">
          <li>
            <a href="first">Home</a>
          </li>
          <li>
            <a href="second">Another Page</a>
          </li>
          
        </ul>
      </div>
    </div>
  </div>
</div>

<script>
	$(document).ready(function () {
		$('ul.nav > li').click(function(e) {
			$('ul.nav > li').removeClass('active');
			$(this).addClass('active');
		});
	});
</script>